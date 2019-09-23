/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ValueObjects;

import java.io.*;
import java.util.*;

/**
 *
 * @author Nguy Minh Trong
 */
public class Node implements Serializable {

    private static final long serialVersionUID = 1;
    private int ma;
    private int port;
    private String ten;
    private ArrayList<String> danhsachFile;

    public Node() {
        super();
    }

    public Node(int ma, int port, String ten, ArrayList<String> danhsachFile) {
        super();
        this.ma = ma;
        this.port = port;
        this.ten = ten;
        this.danhsachFile = danhsachFile;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public ArrayList<String> getDanhsachFile() {
        return danhsachFile;
    }

    public void setDanhsachFile(ArrayList<String> danhsachFile) {
        this.danhsachFile = danhsachFile;
    }

}
