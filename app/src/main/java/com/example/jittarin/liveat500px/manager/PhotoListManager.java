package com.example.jittarin.liveat500px.manager;

import android.content.Context;

import com.example.jittarin.liveat500px.bus.Contextor;
import com.example.jittarin.liveat500px.dao.PhotoItemCollectionDao;

/**
 * Created by nuuneoi on 11/16/2014.
 */
public class PhotoListManager {

    private static PhotoListManager instance;

    public static PhotoListManager getInstance() {
        if (instance == null)
            instance = new PhotoListManager();
        return instance;
    }

    private PhotoItemCollectionDao photoItemCollectionDao;
    private Context mContext;

    private PhotoListManager() {
        mContext = Contextor.getInstance().getContext();
    }

    public PhotoItemCollectionDao getPhotoItemCollectionDao() {
        return photoItemCollectionDao;
    }

    public void setPhotoItemCollectionDao(PhotoItemCollectionDao photoItemCollectionDao) {
        this.photoItemCollectionDao = photoItemCollectionDao;
    }
}
