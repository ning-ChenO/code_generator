package com.chen.generator;

import com.chen.model.MainTemplateConfig;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

public class MainGenerator {
    public static void main(String[] args) throws TemplateException, IOException {
        // 1. 静态文件生成
        String projectPath = System.getProperty("user.dir");
        // 输出
        String inputPath = projectPath + File.separator + "chen-generator-dome-projects" + File.separator + "acm-template";
        // 输入
        String outputPath = projectPath;
        // 复制
        StaticGenerator.copyFilesByHutool(inputPath, outputPath);

        // 2. 动态文件
        String dynamicInputPath = projectPath + File.separator + "chen-generator-basic" + File.separator + "src/main/resources/templates/MainTemplate.java.ftl";
        String dynamicOutputPath = projectPath + File.separator + "acm-template/src/com/chen/acm/MainTemplate.java";

        MainTemplateConfig mainTemplateConfig = new MainTemplateConfig();
        mainTemplateConfig.setAuthor("chen");
        mainTemplateConfig.setLoop(false);
        mainTemplateConfig.setOutputText("求和结果：");
        DynamicGenerator.doGenerate(dynamicInputPath, dynamicOutputPath, mainTemplateConfig);
    }
}
