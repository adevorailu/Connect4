package com.aetxabao.connect4;

import java.util.Random;

/**
 * @author Nombre Apellido
 */
public class Tablero {

    public final static char O = 'O';
    public final static char X = 'X';
    public final static char L = ' ';
    private final static int W = 7;
    private final static int H = 6;
    private int contador;
    private char turno;
    private final int ancho;
    private final int alto;
    private final char[][] m;

    public Tablero() {
        contador = 0;
        turno = O;
        ancho = W;
        alto = H;
        m = new char[ancho][alto];
        for (int i = 0; i < ancho; i++) {
            for (int j = 0; j < alto; j++) {
                m[i][j] = L;
            }
        }
    }

    public Tablero(char[][] m) {
        turno = X;
        this.m = m;
        int cntRojo = 0;
        int cntAmarillo = 0;
        ancho = m.length;
        alto = m[0].length;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 'O'){
                    cntRojo++;
                }
                else if (m[i][j] == 'X'){
                    cntAmarillo++;
                }
            }
        }
        contador = cntAmarillo + cntRojo;
        if (cntRojo > cntAmarillo){
            turno = X;
        }else turno = O;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    public int getContador() {
        return contador;
    }

    public char[][] getMatriz(){
        return m;
    }

    public char getTurno() {
        return turno;
    }

    public void iniciaTurno() {
        int num = (int)(Math.random() * 2);
        if (num == 0){
            turno = 'X';
        }else if (num == 1){
            turno = 'O';
        }
    }

    public void cambiaTurno() {
        if (turno == 'X'){
            turno = 'O';
        }else if (turno == 'O'){
            turno = 'X';
        }
    }

    public boolean estaColumnaLibre(int columna) {
        boolean flag = false;
        if (columna < 0 || columna > m[0].length){
            flag = false;
        }
        for (int i = 0; i < m[columna].length; i++) {
            if (m[columna][i] == ' '){
                flag = true;
            }
        }
        return flag;
    }

    public void inserta(char ficha, int columna) {
        if (estaColumnaLibre(columna)){
            for (int i = 0; i < m[columna].length; i++) {
                if (m[columna][i] == ' '){
                    m[columna][i] = ficha;
                    contador++;
                    break;
                }
            }
        }
    }

    public boolean estaLleno() {
        return contador == alto*ancho;
    }

    public boolean gana(char jugador) {
        boolean b;
        b = ganaHorizontal(jugador);
        b = b || ganaVertical(jugador);
        b = b || ganaDiagonalArriba(jugador);
        b = b || ganaDiagonalAbajo(jugador);
        return b;
    }

    private boolean ganaHorizontal(char jugador) {
        boolean b = false;

        return b;
    }

    private boolean hay4Horizontales(int columna, int fila, char jugador){
        //TODO: hay4Horizontales
        return true;
    }

    private boolean ganaVertical(char jugador) {
        //TODO: ganaVertical
        boolean b = false;
        return b;
    }

    private boolean hay4Verticales(int columna, int fila, char jugador){
        //TODO: hay4Verticales
        return true;
    }

    private boolean ganaDiagonalArriba(char jugador) {
        //TODO: ganaDiagonalArriba
        boolean b = false;
        return b;
    }

    private boolean hay4DiagonalesArriba(int columna, int fila, char jugador){
        //TODO: hay4DiagonalesArriba
        return true;
    }

    private boolean ganaDiagonalAbajo(char jugador) {
        //TODO: ganaDiagonalAbajo
        boolean b = false;
        return b;
    }

    private boolean hay4DiagonalesAbajo(int columna, int fila, char jugador){
        //TODO: hay4DiagonalesAbajo
        return true;
    }

    public boolean estaFinalizado() {
        //TODO: finalizado
        return false;
    }

}
