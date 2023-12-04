package com.chen.model;

import lombok.Data;

/**
 * 动态模版配置
 */
@Data
public class MainTemplateConfig {

    /**
     * 是否生成循环
     */
    private boolean loop = false;

    /**
     * 作者注释
     */
    private String author = "chen";

    /**
     * 输出信息
     */
    private String outputText = "输出结果";
}