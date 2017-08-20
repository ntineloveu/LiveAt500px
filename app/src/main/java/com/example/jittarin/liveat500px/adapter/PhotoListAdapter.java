package com.example.jittarin.liveat500px.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.jittarin.liveat500px.dao.PhotoItemDao;
import com.example.jittarin.liveat500px.manager.PhotoListManager;
import com.example.jittarin.liveat500px.view.PhotoListItem;

/**
 * Created by Jittarin on 8/20/2017.
 */

public class PhotoListAdapter extends BaseAdapter {
    @Override
    public int getCount() {
        if (PhotoListManager.getInstance().getPhotoItemCollectionDao() == null) {
            return 0;
        }
        if (PhotoListManager.getInstance().getPhotoItemCollectionDao().getData() == null) {
            return 0;
        }
        return PhotoListManager.getInstance().getPhotoItemCollectionDao().getData().size();
    }

    @Override
    public Object getItem(int i) {
        return PhotoListManager.getInstance().getPhotoItemCollectionDao().getData().get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        PhotoListItem item;
        if (view != null) {
            item = (PhotoListItem) view;
        } else {
            item = new PhotoListItem(viewGroup.getContext());
        }

        PhotoItemDao dao = (PhotoItemDao) getItem(i);
        item.setNameText(dao.getCaption());
        item.setDescriptionText(dao.getUsername() + "\n" + dao.getCamera());
        item.setImagUrl(dao.getImageUrl());

        return item;
    }
}
