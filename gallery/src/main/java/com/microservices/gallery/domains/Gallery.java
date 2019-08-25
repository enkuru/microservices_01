package com.microservices.gallery.domains;

import java.util.List;

public class Gallery {
    private Integer id;

    private List<Object> images;

    /**
     * @return Integer return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }


    /**
     * @return List<Object> return the images
     */
    public List<Object> getImages() {
        return images;
    }

    /**
     * @param images the images to set
     */
    public void setImages(List<Object> images) {
        this.images = images;
    }

}