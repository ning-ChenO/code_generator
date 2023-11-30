package com.chen.generator;

import cn.hutool.core.io.FileUtil;

import java.io.File;

public class StaticGenerator {
    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        String inputPath = projectPath + File.separator + "chen-generator-dome-projects" + File.separator + "acm-template";
        String outputPath = projectPath;
        copyFilesByHutool(inputPath, outputPath);
    }


    /**
     * 拷贝文件 (Hutool 实现，把输入目录完整拷贝到输出目录下
     * @param inputPath 输入目录
     * @param outputPath 输出目录
     */

    public static void copyFilesByHutool(String inputPath, String outputPath) {
        FileUtil.copy(inputPath, outputPath, false);
    }

}
