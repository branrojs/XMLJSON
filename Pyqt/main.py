#!/usr/bin/env python
# -*- coding: utf-8 -*-
import sys, time
from PyQt4 import QtGui, QtCore
from PyQt4.QtCore import *
from PyQt4.QtGui import *
from os import listdir, path, stat
from mimetypes import MimeTypes
from aminis import Ui_layout1
import xml.etree.ElementTree as ET

class Principal(QtGui.QMainWindow):
        def __init__(self, parent=None):
                super(Principal, self).__init__(parent)
                self.ui = Ui_layout1()
                self.ui.setupUi(self)
                self.getDir()
                QtCore.QObject.connect(self.ui.abrirtxt, QtCore.SIGNAL("clicked()"), self.previ)
                QtCore.QObject.connect(self.ui.convertir, QtCore.SIGNAL("clicked()"), self.convertirxml)
                QtCore.QObject.connect(self.ui.btn_verxml, QtCore.SIGNAL("clicked()"), self.actualizar)

                

        def getDir(self):
                self.ui.directorio.clear()
                #ruta
                direc = "D:/Documentos/Universidad/Progra 4/Examen 1/Pyqt/archivos"
                #C:/Users/admin/Desktop/Examen/Pyqt/archivos
                if path.isdir(direc):
                        for element in listdir(direc):
                                nombre= element
                                pathinfo= direc + "/" + nombre
                                informacion = stat(pathinfo)

                                if path.isdir(pathinfo):
                                        tipo = "Carpeta de archivos"
                                        tamano = ""
                                else:
                                        mime = MimeTypes()
                                        tipo = mime.guess_type(pathinfo)[0]
                                        tamano = str(informacion.st_size)+ " bytes"

                                fecha = str(time.ctime(informacion.st_mtime))

                                row = [nombre,fecha,tipo,tamano]
                                self.ui.directorio.insertTopLevelItems(0, [QTreeWidgetItem(self.ui.directorio, row)])


        def previ(self):
                item = self.ui.directorio.currentItem()
                elemento = "D:/Documentos/Universidad/Progra 4/Examen 1/Pyqt/archivos/"+item.text(0)
                #C:/Users/admin/Desktop/Examen/Pyqt/archivos/
                archivo = open(elemento,"r")
                contenido = archivo.read()
                #str = convertir a string, rstrip = limpia el string
                # split = separa el string, volviendolo una lista nueva.
                #asi sacaremos los datos y lo volveremos un archivo xml
                #nomb2 = str(lista[0]).rstrip("['\n',").split(" : ")
                archivo.close()
                #print nomb2[1]
                self.ui.previsualizar.setPlainText(contenido)

        def convertirxml(self): 
                item = self.ui.directorio.currentItem()
                elemento = "D:/Documentos/Universidad/Progra 4/Examen 1/Pyqt/archivos/"+item.text(0)
                archivo = open(elemento, "r")
                lista = archivo.readlines()
                archivo.close()
                print lista
                infog = str(lista[0]).rstrip("['\n']")
                nombre = str(lista[1]).rstrip("['\n']").split(" : ")
                ced = str(lista[2]).rstrip("['\n']").split(" : ")
                print ced
                direcc = str(lista[3]).rstrip("['\n']").split(" : ")
                cor = str(lista[4]).rstrip("['\n']").split(" : ")
                tel = str(lista[5]).rstrip("['\n']").split(" : ")
                edu = str(lista[6]).rstrip("['\n']")
                tool = 7
                educ = [edu]
                while(True):
                        titulo = str(lista[tool]).rstrip("['\n']")
                        if(titulo != "Experiencia"):
                                educ.append(titulo)
                                tool = tool+1
                                lugar = str(lista[tool]).rstrip("['\n']").split(" : ")
                                educ.append(lugar[1])
                                tool = tool+1
                                titul = str(lista[tool]).rstrip("['\n']").split(" : ")
                                educ.append(titul[1])
                                tool = tool+1
                                years = str(lista[tool]).rstrip("['\n']").split(" : ")
                                educ.append(years[1])
                                tool = tool +1
                        else:
                                break

                expe = str(lista[tool].rstrip("['\n']"))
                experiencia = [expe]
                tool = tool+1
                while(True):
                        if(tool==len(lista)):
                                break
                        else:
                                place=str(lista[tool]).rstrip("['\t\n']").split(" : ")
                                if(place[0]=="\tLugar"):
                                        experiencia.append(place[1])
                                        tool = tool+1
                                        cargo=str(lista[tool]).rstrip("['\n']").split(" : ")
                                        experiencia.append(cargo[1])
                                        tool=tool + 1
                                        tieser = str(lista[tool]).rstrip("['\n']").split(" : ")
                                        experiencia.append(tieser[1])
                                        tool = tool+1
                                else:
                                        break
                print  "\n\n\nlectura del txt exitosa, sustracion de datos exitoso, creando archivo xml"
                root = ET.Element("Administrativo")
                gi = ET.SubElement(root, "informacion")
                nambres = ET.SubElement(gi, "Nombre").text = nombre[1]
                cedx= ET.SubElement(gi,"Cedula").text = ced[1]
                dirx= ET.SubElement(gi,"Direccion").text = direcc[1]
                corex = ET.SubElement(gi, "Correo").text = cor[1]
                telfx = ET.SubElement(gi, "Telefono").text = tel[1]

                eg = ET.SubElement(root, "Educacion")
                a = 1
                b = 2
                c = 3
                d = 4
                while (True):
                        if(a == len(educ)):
                           break
                        else:
                           fa =ET.SubElement(eg, educ[a].strip())
                           lu=ET.SubElement(fa,"Lugar").text = repr(educ[b])
                           til=ET.SubElement(fa,"Titulo").text = repr(educ[c])
                           ye=ET.SubElement(fa,"Years").text = repr(educ[d])
                           a = a + 4
                           b = b + 4
                           c = c + 4
                           d = d + 4

                expi = ET.SubElement(root, "Experiencia")
                a1 =1
                b1 = 2
                c1 = 3
                while(True):
                        if(a1 == len(experiencia)):
                           break
                        else:
                           pl=ET.SubElement(expi,"Lugar").text = experiencia[a1]
                           cag=ET.SubElement(expi,"Puesto").text = experiencia[b1]
                           tipet=ET.SubElement(expi,"Tiempo_trabajado").text = experiencia[c1]
                           a1= a1+3
                           b1=b1+3
                           c1=c1+3
                

                tree = ET.ElementTree(root)
                filename= ced[1] + ".xml"
                tree.write("D:/Documentos/Universidad/Progra 4/Examen 1/Pyqt/xmls/"+
                        filename)
                print "archivo xml creado"

        def actualizar(self):
                self.ui.directorio.clear()
                #ruta
                direc = "D:/Documentos/Universidad/Progra 4/Examen 1/Pyqt/archivos"
                #C:/Users/admin/Desktop/Examen/Pyqt/archivos
                if path.isdir(direc):
                        for element in listdir(direc):
                                nombre= element
                                pathinfo= direc + "/" + nombre
                                informacion = stat(pathinfo)

                                if path.isdir(pathinfo):
                                        tipo = "Carpeta de archivos"
                                        tamano = ""
                                else:
                                        mime = MimeTypes()
                                        tipo = mime.guess_type(pathinfo)[0]
                                        tamano = str(informacion.st_size)+ " bytes"

                                fecha = str(time.ctime(informacion.st_mtime))

                                row = [nombre,fecha,tipo,tamano]
                                self.ui.directorio.insertTopLevelItems(0, [QTreeWidgetItem(self.ui.directorio, row)])

                

                

if __name__ == "__main__":

        app = QtGui.QApplication(sys.argv)
        myapp = Principal()
        myapp.show()
        sys.exit(app.exec_())
