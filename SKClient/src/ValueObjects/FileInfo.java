/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ValueObjects;
import java.io.*;

/**
 *
 * @author Nguy Minh Trong
 */
public class FileInfo implements Serializable{
    private static final long serialVersionUID = 1;
    private String DesDirectory;
    private String SourDirectory;
    private String filename;
    private long filesize;
    private int joinoffile;
    private int ByteLength;
    private String status;
    
    public String getDesDirectory() {
        return DesDirectory;
    }

    public void setDesDirectory(String DesDirectory) {
        this.DesDirectory = DesDirectory;
    }

    public String getSourDirectory() {
        return SourDirectory;
    }

    public void setSourDirectory(String SourDirectory) {
        this.SourDirectory = SourDirectory;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public long getFilesize() {
        return filesize;
    }

    public void setFilesize(long filesize) {
        this.filesize = filesize;
    }

    public int getJoinoffile() {
        return joinoffile;
    }

    public void setJoinoffile(int joinoffile) {
        this.joinoffile = joinoffile;
    }

    public int getByteLength() {
        return ByteLength;
    }

    public void setByteLength(int ByteLength) {
        this.ByteLength = ByteLength;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
