package com.example.longhnph55234assignmentresapigd1.DTO;

public class ShoeDTO {
    private String _id;
    private String name;
    private String description;
    private long price;
    private int url;
    private boolean isFavorite;
    private String category; // Nike, Adidas, Puma, Van
    private int quantity;

    public ShoeDTO(String name, String description, long price, int url, boolean isFavorite, String category, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.url = url;
        this.isFavorite = isFavorite;
        this.category = category;
        this.quantity = quantity;
    }


    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getUrl() {
        return url;
    }

    public void setUrl(int url) {
        this.url = url;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean isFavorite) {
        this.isFavorite = isFavorite;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
