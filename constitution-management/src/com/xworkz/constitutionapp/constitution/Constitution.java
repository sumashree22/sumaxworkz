package com.xworkz.constitutionapp.constitution;

public class Constitution {

        private int articleNumber;
        private String title;
        private String description;
        private String amendmentDate;
        private boolean isActive;
        private String enactedBy;
        private String applicableTo;

        public void setArticleNumber(int articleNumber) {
            this.articleNumber = articleNumber;
        }

        public int getArticleNumber() {
            return articleNumber;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }

        public void setAmendmentDate(String amendmentDate) {
            this.amendmentDate = amendmentDate;
        }

        public String getAmendmentDate() {
            return amendmentDate;
        }

        public void setIsActive(boolean isActive) {
            this.isActive = isActive;
        }

        public boolean getIsActive() {
            return isActive;
        }

        public void setEnactedBy(String enactedBy) {
            this.enactedBy = enactedBy;
        }

        public String getEnactedBy() {
            return enactedBy;
        }

        public void setApplicableTo(String applicableTo) {
            this.applicableTo = applicableTo;
        }

        public String getApplicableTo() {
            return applicableTo;
        }

}
