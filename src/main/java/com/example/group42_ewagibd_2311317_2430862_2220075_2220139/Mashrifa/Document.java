package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Mashrifa;

import java.time.LocalDate;

public class Document {
    private String documentId;
    private String claimId;      // links document to specific claim
    private String fileName;
    private String fileType;
    private LocalDate uploadedDate;
    private String filePath;

    public Document(String documentId, String claimId, String fileName, String fileType, LocalDate uploadedDate, String filePath) {
        this.documentId = documentId;
        this.claimId = claimId;
        this.fileName = fileName;
        this.fileType = fileType;
        this.uploadedDate = uploadedDate;
        this.filePath = filePath;
    }


    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getClaimId() {
        return claimId;
    }

    public void setClaimId(String claimId) {
        this.claimId = claimId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public LocalDate getUploadedDate() {
        return uploadedDate;
    }

    public void setUploadedDate(LocalDate uploadedDate) {
        this.uploadedDate = uploadedDate;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentId='" + documentId + '\'' +
                ", claimId='" + claimId + '\'' +
                ", fileName='" + fileName + '\'' +
                ", fileType='" + fileType + '\'' +
                ", uploadedDate=" + uploadedDate +
                ", filePath='" + filePath + '\'' +
                '}';
    }
}
