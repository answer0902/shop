package com.answer.server.model;

public class Desc {
    private Integer descId;

    private String prodService;

    private String prodComment;

    private String imgSrc;

    public Integer getDescId() {
        return descId;
    }

    public void setDescId(Integer descId) {
        this.descId = descId;
    }

    public String getProdService() {
        return prodService;
    }

    public void setProdService(String prodService) {
        this.prodService = prodService == null ? null : prodService.trim();
    }

    public String getProdComment() {
        return prodComment;
    }

    public void setProdComment(String prodComment) {
        this.prodComment = prodComment == null ? null : prodComment.trim();
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc == null ? null : imgSrc.trim();
    }
}