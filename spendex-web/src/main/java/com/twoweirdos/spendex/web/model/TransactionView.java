package com.twoweirdos.spendex.web.model;

import com.twoweirdos.spendex.model.Transaction;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Sean Kleinjung
 */
public class TransactionView {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    private String uploadedFileName;
    private String dateString;
    private BigDecimal amount;
    private String description;
    private String category;

    public TransactionView(Transaction transaction) {
        uploadedFileName = transaction.getUploadedFile().getFilename();
        dateString = dateFormat.format(transaction.getDate());
        amount = transaction.getAmount();
        description = transaction.getDescription();
        category = transaction.getCategory();
    }

    public String getUploadedFileName() {
        return uploadedFileName;
    }

    public void setUploadedFileName(String uploadedFileName) {
        this.uploadedFileName = uploadedFileName;
    }

    public String getDateString() {
        return dateString;
    }

    public void setDateString(String dateString) {
        this.dateString = dateString;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}