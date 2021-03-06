package com.rcplatform.livechat.dto.request;

/**
 * Created by fj on 2017/8/9.
 */

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_promotion")
public class PromotionDto implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "app_id")
    private Integer appId;

    /**
     * 位置1个人页，2消息页，3相机
     */
    private Integer position;

    /**
     * 图片
     */
    private String img;

    /**
     * 地址
     */
    private String address;

    /**
     * 1:开启 2:关闭
     */
    private Integer open;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 文案1
     */
    private  String contentOne;

    /**
     * 文案2
     */
    private String contentTwo;

    /**
     * 语言代码
     */
    private String languageCode;

    /**
     * 语言代码
     */
    private Integer languageId;

    public String getContentOne() {
        return contentOne;
    }

    public void setContentOne(String contentOne) {
        this.contentOne = contentOne;
    }

    public String getContentTwo() {
        return contentTwo;
    }

    public void setContentTwo(String contentTwo) {
        this.contentTwo = contentTwo;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return app_id
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * @param appId
     */
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /**
     * 获取位置个人页，消息页，相机
     *
     * @return position - 位置个人页，消息页，相机
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * 设置位置个人页，消息页，相机
     *
     * @param position 位置个人页，消息页，相机
     */
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * 获取图片
     *
     * @return img - 图片
     */
    public String getImg() {
        return img;
    }

    /**
     * 设置图片
     *
     * @param img 图片
     */
    public void setImg(String img) {
        this.img = img;
    }


    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取1:开启 2:关闭
     *
     * @return open - 1:开启 2:关闭
     */
    public Integer getOpen() {
        return open;
    }

    /**
     * 设置1:开启 2:关闭
     *
     * @param open 1:开启 2:关闭
     */
    public void setOpen(Integer open) {
        this.open = open;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }
}