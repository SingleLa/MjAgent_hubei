package com.rafo.mjagent.model.agency;

import java.util.List;

public class Menu implements Comparable{
    private Integer id;

    private String title;

    private Integer level;

    private String icon;

    private Boolean spread;

    private Integer index;

    private Integer parents;

    private List<Menu> children;

    private String href;

    private Boolean active;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public List<Menu> getChildren() {
        return children;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Boolean getSpread() {
        return spread;
    }

    public void setSpread(Boolean spread) {
        this.spread = spread;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getParents() {
        return parents;
    }

    public void setParents(Integer parents) {
        this.parents = parents;
    }

    @Override
    public int compareTo(Object o) {
        Menu m = (Menu)o;
        int otherIndex = m.getIndex();
        return this.index.compareTo(otherIndex);
    }
}