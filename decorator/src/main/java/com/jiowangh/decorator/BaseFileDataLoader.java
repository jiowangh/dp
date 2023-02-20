package com.jiowangh.decorator;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @author wangjiong
 * @create 2023/2/20 16:36
 */
public class BaseFileDataLoader implements DataLoader{

    private String filePath;

    public BaseFileDataLoader(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String read() {
        try {
            String result = FileUtils.readFileToString(new File(filePath), "utf-8");
            return result;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void write(String data) {
        try{
            FileUtils.writeStringToFile(new File(filePath), data, "utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
