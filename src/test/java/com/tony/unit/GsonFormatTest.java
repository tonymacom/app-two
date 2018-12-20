package com.tony.unit;

import java.util.List;

/**
 * @author www.yamibuy.com
 * @desc :  gsonformat测试
 * @date 2018/12/20
 * <b>版权所有：</b>版权所有(C) 2018，www.yamibuy.com<br>
 */
public class GsonFormatTest {

        /**
         *  快捷键使用alt + s 出现Gsonformat框, 输入json即可.
         */


    /**
     * Category : [{"categoryId":1,"categoryName":"饮品","categoryImage":"/upload/yinpin.jpg"},{"categoryId":2,"categoryName":"食品","categoryImage":"/upload/shiping.jpg"},{"categoryId":3,"categoryName":"酒类","categoryImage":"/upload/jiullei.jpg"}]
     * recommend : {"id":11,"productName":"统一老坛泡椒牛肉袋面香辣味110g*24袋","filenameSmall":"/upload/ty_ltpj_small.jpg","productPrice":48,"productCost":47.5}
     */

    private Recommend recommend;
    private List<Category> Category;

    public static class Recommend {

        /**
         * id : 11
         * productName : 统一老坛泡椒牛肉袋面香辣味110g*24袋
         * filenameSmall : /upload/ty_ltpj_small.jpg
         * productPrice : 48
         * productCost : 47.5
         */

        private int id;
        private String productName;
        private String filenameSmall;
        private int productPrice;
        private double productCost;

    }

    public static class Category {
        /**
         * categoryId : 1
         * categoryName : 饮品
         * categoryImage : /upload/yinpin.jpg
         */

        private int categoryId;
        private String categoryName;
        private String categoryImage;

    }
}
