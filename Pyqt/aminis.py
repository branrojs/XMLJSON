# -*- coding: utf-8 -*-

# Form implementation generated from reading ui file 'adminis.ui'
#
# Created by: PyQt4 UI code generator 4.11.4
#
# WARNING! All changes made in this file will be lost!

from PyQt4 import QtCore, QtGui

try:
    _fromUtf8 = QtCore.QString.fromUtf8
except AttributeError:
    def _fromUtf8(s):
        return s

try:
    _encoding = QtGui.QApplication.UnicodeUTF8
    def _translate(context, text, disambig):
        return QtGui.QApplication.translate(context, text, disambig, _encoding)
except AttributeError:
    def _translate(context, text, disambig):
        return QtGui.QApplication.translate(context, text, disambig)

class Ui_layout1(object):
    def setupUi(self, layout1):
        layout1.setObjectName(_fromUtf8("layout1"))
        layout1.resize(785, 589)
        layout1.setWindowTitle(_fromUtf8(""))
        self.centralwidget = QtGui.QWidget(layout1)
        self.centralwidget.setObjectName(_fromUtf8("centralwidget"))
        self.gridLayout = QtGui.QGridLayout(self.centralwidget)
        self.gridLayout.setObjectName(_fromUtf8("gridLayout"))
        self.directorio = QtGui.QTreeWidget(self.centralwidget)
        self.directorio.setObjectName(_fromUtf8("directorio"))
        self.gridLayout.addWidget(self.directorio, 0, 0, 1, 1)
        self.previsualizar = QtGui.QPlainTextEdit(self.centralwidget)
        self.previsualizar.setReadOnly(True)
        self.previsualizar.setObjectName(_fromUtf8("previsualizar"))
        self.gridLayout.addWidget(self.previsualizar, 1, 0, 1, 1)
        self.gridLayout_2 = QtGui.QGridLayout()
        self.gridLayout_2.setObjectName(_fromUtf8("gridLayout_2"))
        self.abrirtxt = QtGui.QPushButton(self.centralwidget)
        self.abrirtxt.setObjectName(_fromUtf8("abrirtxt"))
        self.gridLayout_2.addWidget(self.abrirtxt, 0, 0, 1, 1)
        self.convertir = QtGui.QPushButton(self.centralwidget)
        self.convertir.setObjectName(_fromUtf8("convertir"))
        self.gridLayout_2.addWidget(self.convertir, 1, 0, 1, 1)
        self.btn_verxml = QtGui.QPushButton(self.centralwidget)
        self.btn_verxml.setObjectName(_fromUtf8("btn_verxml"))
        self.gridLayout_2.addWidget(self.btn_verxml, 2, 0, 1, 1)
        self.gridLayout.addLayout(self.gridLayout_2, 2, 0, 1, 1)
        layout1.setCentralWidget(self.centralwidget)
        self.statusbar = QtGui.QStatusBar(layout1)
        self.statusbar.setObjectName(_fromUtf8("statusbar"))

        self.retranslateUi(layout1)
        QtCore.QMetaObject.connectSlotsByName(layout1)

    def retranslateUi(self, layout1):
        self.directorio.headerItem().setText(0, _translate("layout1", "Nombre", None))
        self.directorio.headerItem().setText(1, _translate("layout1", "Fecha Modifiación", None))
        self.directorio.headerItem().setText(2, _translate("layout1", "Tipo", None))
        self.directorio.headerItem().setText(3, _translate("layout1", "Tamaño", None))
        self.abrirtxt.setText(_translate("layout1", "Previsualizar", None))
        self.convertir.setText(_translate("layout1", "Convertir a XML", None))
        self.btn_verxml.setText(_translate("layout1", "Actualizar Documentos", None))


if __name__ == "__main__":
    import sys
    app = QtGui.QApplication(sys.argv)
    layout1 = QtGui.QMainWindow()
    ui = Ui_layout1()
    ui.setupUi(layout1)
    layout1.show()
    sys.exit(app.exec_())

