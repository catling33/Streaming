package com.laioffer.jupiter.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FavoriteRequestBody {
    // no need to convert back from Java object to JSon
    // only need to convert from JSon key to Java field
    private final Item favoriteItem;

    @JsonCreator // constructor : convert from JSon to object of FavoriteRequestBody
    public FavoriteRequestBody(@JsonProperty("favorite") Item favoriteItem) {
        // look for "favorite" key in JSon, and convert to Java field
        // the content matching "favorite" key in Json are converted to Java Object - Item
        this.favoriteItem = favoriteItem;
    }

    public Item getFavoriteItem() {
        return favoriteItem;
    }
}
