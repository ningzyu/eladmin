package me.zhengjie;

import java.io.*;
import java.nio.channels.FileChannel;

public class TsUtils {

    public static void mergeFiles(String dir,String filePath){
        File[] files=new File(dir).listFiles();
        mergeFiles(files,filePath);
    }
    public static void mergeFile(String filePath, String... path){
        File[] files=new File[path.length];
        for (int i=0;i<path.length;i++){
            files[i]=new File(path[i]);
        }
        mergeFiles(files,filePath);
    }
    public static void mergeFiles(File[] files,String filePath){
        File resultFile = new File(filePath);
        try {
            FileChannel resultFileChannel = new FileOutputStream(resultFile, true).getChannel();
            for (int i = 0; i < files.length; i ++) {
                if (!files[i].getName().contains("ts")){
                    continue;
                }
                System.out.println(""+files[i].getName());
                FileChannel blk = new FileInputStream(files[i]).getChannel();
                resultFileChannel.transferFrom(blk, resultFileChannel.size(), blk.size());
                blk.close();
            }
            resultFileChannel.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
//            return false;
        } catch (IOException e) {
            e.printStackTrace();
//            return false;
        }
    }

}
