package com.qingyou.lesson.model;

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
public class Merchant {

    /**
     * 商家的表示Id
     */
    private String merchantId;
    /**
     * 商品名字
     */
    private String name;

    /**
     * 商品图片
     */
    private String pic;

    /**
     * 月销量
     */
    private int sales;
    /**
     * 50分为满分
     */
    private int score;
    /**
     * 送达时间
     */
    private double minute;
    /**
     * 距离
     */
    private double kilometer;
    /**
     * 起送价
     */
    private double leastMoney;
    /**
     * 配送价
     */
    private double deliveryMoney;
    /**
     * 备注
     */
    private String remark;
    /**
     * 优惠
     */
    private List<String> discounts;

    public Merchant() {
    }

    public Merchant(String merchantId, String name, String pic, int sales, int score, double minute, double kilometer, double leastMoney, double deliveryMoney, String remark, List<String> discounts) {
        this.merchantId = merchantId;
        this.name = name;
        this.pic = pic;
        this.sales = sales;
        this.score = score;
        this.minute = minute;
        this.kilometer = kilometer;
        this.leastMoney = leastMoney;
        this.deliveryMoney = deliveryMoney;
        this.remark = remark;
        this.discounts = discounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public double getMinute() {
        return minute;
    }

    public void setMinute(double minute) {
        this.minute = minute;
    }

    public double getKilometer() {
        return kilometer;
    }

    public void setKilometer(double kilometer) {
        this.kilometer = kilometer;
    }

    public double getLeastMoney() {
        return leastMoney;
    }

    public void setLeastMoney(double leastMoney) {
        this.leastMoney = leastMoney;
    }

    public double getDeliveryMoney() {
        return deliveryMoney;
    }

    public void setDeliveryMoney(double deliveryMoney) {
        this.deliveryMoney = deliveryMoney;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<String> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(List<String> discounts) {
        this.discounts = discounts;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    @Override
    public String toString() {
        return "Merchant{" +
                "name='" + name + '\'' +
                ", pic='" + pic + '\'' +
                ", sales=" + sales +
                ", score=" + score +
                ", minute=" + minute +
                ", kilometer=" + kilometer +
                ", leastMoney=" + leastMoney +
                ", deliveryMoney=" + deliveryMoney +
                ", remark='" + remark + '\'' +
                ", discounts=" + discounts +
                '}';
    }
}
