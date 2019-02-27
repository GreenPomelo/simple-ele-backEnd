package com.qingyou.lesson.simulationdata;

import com.qingyou.lesson.model.Item;
import com.qingyou.lesson.model.Merchant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Solomon
 * @date 2019/2/27
 * if you founded any bugs in my code
 * look at my face
 * that's a feature
 * ─ wow ──▌▒█───────────▄▀▒▌───
 * ────────▌▒▒▀▄───────▄▀▒▒▒▐───
 * ───────▐▄▀▒▒▀▀▀▀▄▄▄▀▒▒▒▒▒▐───
 * ─────▄▄▀▒▒▒▒▒▒▒▒▒▒▒█▒▒▄█▒▐───
 * ───▄▀▒▒▒▒▒▒ such difference ─
 * ──▐▒▒▒▄▄▄▒▒▒▒▒▒▒▒▒▒▒▒▒▀▄▒▒▌──
 * ──▌▒▒▐▄█▀▒▒▒▒▄▀█▄▒▒▒▒▒▒▒█▒▐──
 * ─▐▒▒▒▒▒▒▒▒▒▒▒▌██▀▒▒▒▒▒▒▒▒▀▄▌─
 * ─▌▒▀▄██▄▒▒▒▒▒▒▒▒▒▒▒░░░░▒▒▒▒▌─
 * ─▌▀▐▄█▄█▌▄▒▀▒▒▒▒▒▒░░░░░░▒▒▒▐─
 * ▐▒▀▐▀▐▀▒▒▄▄▒▄▒▒▒ electrons ▒▌
 * ▐▒▒▒▀▀▄▄▒▒▒▄▒▒▒▒▒▒░░░░░░▒▒▒▐─
 * ─▌▒▒▒▒▒▒▀▀▀▒▒▒▒▒▒▒▒░░░░▒▒▒▒▌─
 * ─▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▐──
 * ──▀ amaze ▒▒▒▒▒▒▒▒▒▒▒▄▒▒▒▒▌──
 * ────▀▄▒▒▒▒▒▒▒▒▒▒▄▄▄▀▒▒▒▒▄▀───
 * ───▐▀▒▀▄▄▄▄▄▄▀▀▀▒▒▒▒▒▄▄▀─────
 * ──▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▀▀────────
 * " "
 */
public class DataHolder {

    public static final List<Merchant> MERCHANTS = new ArrayList<>();
    public static final List<Item> RICE_MERCHANT = new ArrayList<>();
    public static final List<Item> FISH_MERCHANT = new ArrayList<>();
    public static final List<Item> FLOWER_MERCHANT = new ArrayList<>();

    static {

        //商家信息
        MERCHANTS.add(new Merchant("NJUPT1","米乡",
                "https://wx.qlogo.cn/mmopen/vi_32/y2smdnib7JELX7BbzCYQD07zZ6IiamJc5K9rdoxTG6ht0eZJr7iaQ07U28D7uib3zX9qEoykAenWuUardInJGEYd7A/0",
                520,43,30,1.5,20,5,"我就不打折",null));
        MERCHANTS.add(new Merchant("NJUPT2","鱼乡",
                "https://wx.qlogo.cn/mmopen/vi_32/y2smdnib7JELX7BbzCYQD07zZ6IiamJc5K9rdoxTG6ht0eZJr7iaQ07U28D7uib3zX9qEoykAenWuUardInJGEYd7A/0",
                1314,48,23,1.1,10,6,"薄利多销", Arrays.asList("满20减10","满35减15")));
        MERCHANTS.add(new Merchant("NJUPT3","鱼米之乡",
                "https://wx.qlogo.cn/mmopen/vi_32/y2smdnib7JELX7BbzCYQD07zZ6IiamJc5K9rdoxTG6ht0eZJr7iaQ07U28D7uib3zX9qEoykAenWuUardInJGEYd7A/0",
                886,35,41,1.0,25,3,"打骨折",Arrays.asList("满20减20","满40减40")));

        //米乡的商品信息
        RICE_MERCHANT.add(new Item("RICE_1","牛肉盖浇饭","牛肉，饭",666,15.1,91));
        RICE_MERCHANT.add(new Item("RICE_2","羊肉盖浇饭","羊肉，饭",1314,16.1,94));
        RICE_MERCHANT.add(new Item("RICE_3","猪肉盖浇饭","猪肉，饭",520,13.1,90));
        RICE_MERCHANT.add(new Item("RICE_4","鸡肉盖浇饭","鸡肉，饭",694,14.1,89));
        RICE_MERCHANT.add(new Item("RICE_5","鸭肉盖浇饭","鸭肉，饭",999,14.1,87));
        RICE_MERCHANT.add(new Item("RICE_6","鹅肉盖浇饭","鹅肉，饭",886,15.1,78));

        //鱼乡的商品信息
        FISH_MERCHANT.add(new Item("FISH_1","墨鱼汤","墨鱼",123,15.1,69));
        FISH_MERCHANT.add(new Item("FISH_2","鲤鱼汤","鲤鱼",456,11.1,79));
        FISH_MERCHANT.add(new Item("FISH_3","鱿鱼汤","鱿鱼",222,13.1,89));
        FISH_MERCHANT.add(new Item("FISH_4","草鱼汤","草鱼",333,12.1,88));
        FISH_MERCHANT.add(new Item("FISH_5","鲫鱼汤","鲫鱼",444,16.7,92));
        FISH_MERCHANT.add(new Item("FISH_6","黑鱼汤","黑鱼",555,13.1,95));

        //鱼米之乡的商品信息
        FLOWER_MERCHANT.add(new Item("FLOWER_1","玫瑰花","玫瑰",694,15.6,99));
        FLOWER_MERCHANT.add(new Item("FLOWER_2","牡丹","牡丹",669,15.8,87));
        FLOWER_MERCHANT.add(new Item("FLOWER_3","绿萝","绿萝",886,16.1,86));
        FLOWER_MERCHANT.add(new Item("FLOWER_4","橘子花","橘子花",520,15.8,69));
        FLOWER_MERCHANT.add(new Item("FLOWER_5","雏菊","雏菊",522,15.7,89));
        FLOWER_MERCHANT.add(new Item("FLOWER_6","勿忘我","勿忘我",133,12.1,76));
    }

}
