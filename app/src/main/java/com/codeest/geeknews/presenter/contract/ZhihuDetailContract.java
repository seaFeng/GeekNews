package com.codeest.geeknews.presenter.contract;

import com.codeest.geeknews.base.BasePresenter;
import com.codeest.geeknews.base.BaseView;
import com.codeest.geeknews.model.bean.DetailExtraBean;
import com.codeest.geeknews.model.bean.ZhihuDetailBean;

/**
 * Created by codeest on 16/8/13.
 */

public interface ZhihuDetailContract {

    interface View extends BaseView {

        void showContent(ZhihuDetailBean zhihuDetailBean);

        void showExtraInfo(DetailExtraBean detailExtraBean);
    }

    interface  Presenter extends BasePresenter<View> {

        void getDetailData(int id);

        void getExtraData(int id);

        void insertLikeData();

        void deleteLikeData();

        boolean queryLikeData(int id);
    }
}