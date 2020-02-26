package cn.iisheng.maven;

import java.util.Set;

/**
 * @author iisheng
 * @date 2019/12/05 15:12:01
 */
public class ProjectObject {
    /**
     * 表示组织或者组织的项目唯一的标识符
     */
    private String groupId;
    /**
     * 表示项目内部组件的标识
     */
    private String artifactId;
    /**
     * 打包方式
     */
    private String packaging;
    /**
     * 表示该artifact 版本号
     */
    private String version;
    /**
     * 依赖的其他项目
     */
    private Set<ProjectObject> dependencies;
    /**
     * 父级项目
     */
    private ProjectObject parent;
    /**
     * 子模块项目
     */
    private Set<ProjectObject> modules;

    // 下面几个属性 仅仅用于生成文档

    /**
     * 项目展示名字
     */
    private String name;
    /**
     * 项目网址
     */
    private String url;
    /**
     * 项目描述
     */
    private String description;

}
