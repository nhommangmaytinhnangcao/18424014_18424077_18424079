/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ValueObjects;

/**
 *
 * @author Nguy Minh Trong
 */
public class FileName {

    private int STT;
    private int PORT;
    private String FileServer;
    private String filename;

    public int getSTT() {
        return STT;
    }

    public void setSTT(int STT) {
        this.STT = STT;
    }

    public int getPORT() {
        return PORT;
    }

    public void setPORT(int PORT) {
        this.PORT = PORT;
    }

    public String getFileServer() {
        return FileServer;
    }

    public void setFileServer(String FileServer) {
        this.FileServer = FileServer;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

}
