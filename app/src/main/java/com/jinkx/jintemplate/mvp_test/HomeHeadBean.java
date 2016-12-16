package com.jinkx.jintemplate.mvp_test;

import java.util.List;

/**
 * Created by jinkx on 2016/12/16.
 */

public class HomeHeadBean {

    /**
     * success : true
     * result : {"result":0,"message":"获取用户头像列表成功！","iconList":[{"picUrl":"https://203.86.25.7/UploadFiles/CustIcon/2016061439500738641.png","ownerId":0,"typeId":14,"assignedPicOwnerTypeTypeName":"用户头像","parkId":0,"assignedParkParkName":null,"seq":1,"category":1,"linkUrl":null,"id":5255},{"picUrl":"https://203.86.25.7/UploadFiles/CustIcon/2016061439620445487.png","ownerId":0,"typeId":14,"assignedPicOwnerTypeTypeName":"用户头像","parkId":0,"assignedParkParkName":null,"seq":2,"category":1,"linkUrl":null,"id":5256},{"picUrl":"https://203.86.25.7/UploadFiles/CustIcon/2016061439772744198.png","ownerId":0,"typeId":14,"assignedPicOwnerTypeTypeName":"用户头像","parkId":0,"assignedParkParkName":null,"seq":3,"category":1,"linkUrl":null,"id":5257},{"picUrl":"https://203.86.25.7/UploadFiles/CustIcon/2016061439772834204.png","ownerId":0,"typeId":14,"assignedPicOwnerTypeTypeName":"用户头像","parkId":0,"assignedParkParkName":null,"seq":4,"category":1,"linkUrl":null,"id":5258},{"picUrl":"https://203.86.25.7/UploadFiles/CustIcon/2016061439772924209.png","ownerId":0,"typeId":14,"assignedPicOwnerTypeTypeName":"用户头像","parkId":0,"assignedParkParkName":null,"seq":5,"category":1,"linkUrl":null,"id":5259},{"picUrl":"https://203.86.25.7/UploadFiles/CustIcon/2016061439772994213.png","ownerId":0,"typeId":14,"assignedPicOwnerTypeTypeName":"用户头像","parkId":0,"assignedParkParkName":null,"seq":6,"category":1,"linkUrl":null,"id":5260}]}
     * error : null
     * unAuthorizedRequest : false
     */

    private boolean success;
    private ResultBean result;
    private Object error;
    private boolean unAuthorizedRequest;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }

    public boolean isUnAuthorizedRequest() {
        return unAuthorizedRequest;
    }

    public void setUnAuthorizedRequest(boolean unAuthorizedRequest) {
        this.unAuthorizedRequest = unAuthorizedRequest;
    }

    public static class ResultBean {
        /**
         * result : 0
         * message : 获取用户头像列表成功！
         * iconList : [{"picUrl":"https://203.86.25.7/UploadFiles/CustIcon/2016061439500738641.png","ownerId":0,"typeId":14,"assignedPicOwnerTypeTypeName":"用户头像","parkId":0,"assignedParkParkName":null,"seq":1,"category":1,"linkUrl":null,"id":5255},{"picUrl":"https://203.86.25.7/UploadFiles/CustIcon/2016061439620445487.png","ownerId":0,"typeId":14,"assignedPicOwnerTypeTypeName":"用户头像","parkId":0,"assignedParkParkName":null,"seq":2,"category":1,"linkUrl":null,"id":5256},{"picUrl":"https://203.86.25.7/UploadFiles/CustIcon/2016061439772744198.png","ownerId":0,"typeId":14,"assignedPicOwnerTypeTypeName":"用户头像","parkId":0,"assignedParkParkName":null,"seq":3,"category":1,"linkUrl":null,"id":5257},{"picUrl":"https://203.86.25.7/UploadFiles/CustIcon/2016061439772834204.png","ownerId":0,"typeId":14,"assignedPicOwnerTypeTypeName":"用户头像","parkId":0,"assignedParkParkName":null,"seq":4,"category":1,"linkUrl":null,"id":5258},{"picUrl":"https://203.86.25.7/UploadFiles/CustIcon/2016061439772924209.png","ownerId":0,"typeId":14,"assignedPicOwnerTypeTypeName":"用户头像","parkId":0,"assignedParkParkName":null,"seq":5,"category":1,"linkUrl":null,"id":5259},{"picUrl":"https://203.86.25.7/UploadFiles/CustIcon/2016061439772994213.png","ownerId":0,"typeId":14,"assignedPicOwnerTypeTypeName":"用户头像","parkId":0,"assignedParkParkName":null,"seq":6,"category":1,"linkUrl":null,"id":5260}]
         */

        private int result;
        private String message;
        private List<IconListBean> iconList;

        public int getResult() {
            return result;
        }

        public void setResult(int result) {
            this.result = result;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public List<IconListBean> getIconList() {
            return iconList;
        }

        public void setIconList(List<IconListBean> iconList) {
            this.iconList = iconList;
        }

        public static class IconListBean {
            /**
             * picUrl : https://203.86.25.7/UploadFiles/CustIcon/2016061439500738641.png
             * ownerId : 0
             * typeId : 14
             * assignedPicOwnerTypeTypeName : 用户头像
             * parkId : 0
             * assignedParkParkName : null
             * seq : 1
             * category : 1
             * linkUrl : null
             * id : 5255
             */

            private String picUrl;
            private int ownerId;
            private int typeId;
            private String assignedPicOwnerTypeTypeName;
            private int parkId;
            private Object assignedParkParkName;
            private int seq;
            private int category;
            private Object linkUrl;
            private int id;

            public String getPicUrl() {
                return picUrl;
            }

            public void setPicUrl(String picUrl) {
                this.picUrl = picUrl;
            }

            public int getOwnerId() {
                return ownerId;
            }

            public void setOwnerId(int ownerId) {
                this.ownerId = ownerId;
            }

            public int getTypeId() {
                return typeId;
            }

            public void setTypeId(int typeId) {
                this.typeId = typeId;
            }

            public String getAssignedPicOwnerTypeTypeName() {
                return assignedPicOwnerTypeTypeName;
            }

            public void setAssignedPicOwnerTypeTypeName(String assignedPicOwnerTypeTypeName) {
                this.assignedPicOwnerTypeTypeName = assignedPicOwnerTypeTypeName;
            }

            public int getParkId() {
                return parkId;
            }

            public void setParkId(int parkId) {
                this.parkId = parkId;
            }

            public Object getAssignedParkParkName() {
                return assignedParkParkName;
            }

            public void setAssignedParkParkName(Object assignedParkParkName) {
                this.assignedParkParkName = assignedParkParkName;
            }

            public int getSeq() {
                return seq;
            }

            public void setSeq(int seq) {
                this.seq = seq;
            }

            public int getCategory() {
                return category;
            }

            public void setCategory(int category) {
                this.category = category;
            }

            public Object getLinkUrl() {
                return linkUrl;
            }

            public void setLinkUrl(Object linkUrl) {
                this.linkUrl = linkUrl;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            @Override
            public String toString() {
                return "IconListBean{" +
                        "picUrl='" + picUrl + '\'' +
                        ", ownerId=" + ownerId +
                        ", typeId=" + typeId +
                        ", assignedPicOwnerTypeTypeName='" + assignedPicOwnerTypeTypeName + '\'' +
                        ", parkId=" + parkId +
                        ", assignedParkParkName=" + assignedParkParkName +
                        ", seq=" + seq +
                        ", category=" + category +
                        ", linkUrl=" + linkUrl +
                        ", id=" + id +
                        '}';
            }
        }
    }
}
