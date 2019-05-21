package model;

public class Heroes {
    private String __id;
    private String name;
    private String desc;

    public Heroes(String name, String desc) {
        this.__id = __id;
        this.name = name;
        this.desc = desc;
    }

    public String get__id() {
        return __id;
    }

    public void set__id(String __id) {
        this.__id = __id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
