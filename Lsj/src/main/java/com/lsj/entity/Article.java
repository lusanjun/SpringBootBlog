package com.lsj.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lusanjun
 * @since 2018-12-18
 */
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "cid", type = IdType.AUTO)
    private Integer cid;

    /**
     * 创建时间
     */
    private String date;

    /**
     * 修改时间
     */
    @TableField("updateDate")
    private LocalDate updateDate;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容文字
     */
    private String content;

    /**
     * 摘要
     */
    private String summry;

    /**
     * 图片路径
     */
    @TableField("imgUrl")
    private String imgUrl;

    /**
     * 类型
     */
    private String kind;

    private String stat;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getSummry() {
        return summry;
    }

    public void setSummry(String summry) {
        this.summry = summry;
    }
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    @Override
    public String toString() {
        return "Article{" +
        "cid=" + cid +
        ", date=" + date +
        ", updateDate=" + updateDate +
        ", title=" + title +
        ", content=" + content +
        ", summry=" + summry +
        ", imgUrl=" + imgUrl +
        ", kind=" + kind +
        ", stat=" + stat +
        "}";
    }
}
