package com.dp.structural.facade;

/**
 * Created by on 1/10/2017.
 */
public class FileEncryptFacade implements AbstractFileFacade {

    private ReadSrcFile readSrcFile;

    private EncryptFile encryptFile;

    private WriteDesFile writeDesFile;

    public FileEncryptFacade() {
        readSrcFile = new ReadSrcFile();
        encryptFile = new EncryptFile();
        writeDesFile = new WriteDesFile();
    }

    @Override
    public void fileEncrypt(String srcFileName, String desFileName) {
        String srcContent = readSrcFile.readFile(srcFileName);
        System.out.println("------我是华丽的分割线------");
        String desContent = encryptFile.encryptContent(srcContent);
        System.out.println("------我是华丽的分割线------");
        writeDesFile.writeFile(desFileName,desContent);
    }
}
