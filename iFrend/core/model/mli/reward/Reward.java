package com.isg.ifrend.core.model.mli.reward;

import java.io.Serializable;
import java.math.BigDecimal;

public class Reward  implements Serializable {
	
	private static final long serialVersionUID = 6857171438257209156L;

	//sale
	private BigDecimal ytdSales;
	private BigDecimal lstSales;
	private BigDecimal ctdSales;	
	//beginning
	private BigDecimal ytdBeginning;
	private BigDecimal lstBeginning;
	private BigDecimal ctdBeginning;	
	//earned
	private BigDecimal ytdEarned;
	private BigDecimal lstEarned;
	private BigDecimal ctdEarned;	
	//bonus
	private BigDecimal ytdBonus;
	private BigDecimal lstBonus;
	private BigDecimal ctdBonus;		
	//adjust
	private BigDecimal ytdAdjust;
	private BigDecimal lstAdjust;
	private BigDecimal ctdAdjust;	
	//redeemed
	private BigDecimal ytdRedeemed;
	private BigDecimal lstRedeemed;
	private BigDecimal ctdRedeemed;	
	//available
	private BigDecimal ytdAvailable;
	private BigDecimal lstAvailable;
	private BigDecimal ctdAvailable;	
	//redemption details
	private String redemptionNumber;
	private String status;
	private String itemDescription;
	private BigDecimal purePoints;
	private BigDecimal fastTrackPoint;
	private BigDecimal amount;
	private BigDecimal deliveryDate;
	private String operatorId;
	private BigDecimal quantity;
	private BigDecimal totalPointRedeem;
	private BigDecimal totlAmountRedeemed;
	
	
	public Reward(){
		
	}
	
	public Reward(BigDecimal ytdSales, BigDecimal lstSales,
			BigDecimal ctdSales, BigDecimal ytdBeginning,
			BigDecimal lstBeginning, BigDecimal ctdBeginning,
			BigDecimal ytdEarned, BigDecimal lstEarned, BigDecimal ctdEarned,
			BigDecimal ytdBonus, BigDecimal lstBonus, BigDecimal ctdBonus,
			BigDecimal ytdAdjust, BigDecimal lstAdjust, BigDecimal ctdAdjust,
			BigDecimal ytdRedeemed, BigDecimal lstRedeemed,
			BigDecimal ctdRedeemed, BigDecimal ytdAvailable,
			BigDecimal lstAvailable, BigDecimal ctdAvailable,
			String redemptionNumber, String status, String itemDescription,
			BigDecimal purePoints, BigDecimal fastTrackPoint,
			BigDecimal amount, BigDecimal deliveryDate, String operatorId,
			BigDecimal quantity, BigDecimal totalPointRedeem,
			BigDecimal totlAmountRedeemed) {
	
		this.ytdSales = ytdSales;
		this.lstSales = lstSales;
		this.ctdSales = ctdSales;
		this.ytdBeginning = ytdBeginning;
		this.lstBeginning = lstBeginning;
		this.ctdBeginning = ctdBeginning;
		this.ytdEarned = ytdEarned;
		this.lstEarned = lstEarned;
		this.ctdEarned = ctdEarned;
		this.ytdBonus = ytdBonus;
		this.lstBonus = lstBonus;
		this.ctdBonus = ctdBonus;
		this.ytdAdjust = ytdAdjust;
		this.lstAdjust = lstAdjust;
		this.ctdAdjust = ctdAdjust;
		this.ytdRedeemed = ytdRedeemed;
		this.lstRedeemed = lstRedeemed;
		this.ctdRedeemed = ctdRedeemed;
		this.ytdAvailable = ytdAvailable;
		this.lstAvailable = lstAvailable;
		this.ctdAvailable = ctdAvailable;
		this.redemptionNumber = redemptionNumber;
		this.status = status;
		this.itemDescription = itemDescription;
		this.purePoints = purePoints;
		this.fastTrackPoint = fastTrackPoint;
		this.amount = amount;
		this.deliveryDate = deliveryDate;
		this.operatorId = operatorId;
		this.quantity = quantity;
		this.totalPointRedeem = totalPointRedeem;
		this.totlAmountRedeemed = totlAmountRedeemed;
	}
	/** getter and  setter **/
	public BigDecimal getYtdSales() {
		return ytdSales;
	}
	public void setYtdSales(BigDecimal ytdSales) {
		this.ytdSales = ytdSales;
	}
	public BigDecimal getLstSales() {
		return lstSales;
	}
	public void setLstSales(BigDecimal lstSales) {
		this.lstSales = lstSales;
	}
	public BigDecimal getCtdSales() {
		return ctdSales;
	}
	public void setCtdSales(BigDecimal ctdSales) {
		this.ctdSales = ctdSales;
	}
	public BigDecimal getYtdBeginning() {
		return ytdBeginning;
	}
	public void setYtdBeginning(BigDecimal ytdBeginning) {
		this.ytdBeginning = ytdBeginning;
	}
	public BigDecimal getLstBeginning() {
		return lstBeginning;
	}
	public void setLstBeginning(BigDecimal lstBeginning) {
		this.lstBeginning = lstBeginning;
	}
	public BigDecimal getCtdBeginning() {
		return ctdBeginning;
	}
	public void setCtdBeginning(BigDecimal ctdBeginning) {
		this.ctdBeginning = ctdBeginning;
	}
	public BigDecimal getYtdEarned() {
		return ytdEarned;
	}
	public void setYtdEarned(BigDecimal ytdEarned) {
		this.ytdEarned = ytdEarned;
	}
	public BigDecimal getLstEarned() {
		return lstEarned;
	}
	public void setLstEarned(BigDecimal lstEarned) {
		this.lstEarned = lstEarned;
	}
	public BigDecimal getCtdEarned() {
		return ctdEarned;
	}
	public void setCtdEarned(BigDecimal ctdEarned) {
		this.ctdEarned = ctdEarned;
	}
	public BigDecimal getYtdBonus() {
		return ytdBonus;
	}
	public void setYtdBonus(BigDecimal ytdBonus) {
		this.ytdBonus = ytdBonus;
	}
	public BigDecimal getLstBonus() {
		return lstBonus;
	}
	public void setLstBonus(BigDecimal lstBonus) {
		this.lstBonus = lstBonus;
	}
	public BigDecimal getCtdBonus() {
		return ctdBonus;
	}
	public void setCtdBonus(BigDecimal ctdBonus) {
		this.ctdBonus = ctdBonus;
	}
	public BigDecimal getYtdAdjust() {
		return ytdAdjust;
	}
	public void setYtdAdjust(BigDecimal ytdAdjust) {
		this.ytdAdjust = ytdAdjust;
	}
	public BigDecimal getLstAdjust() {
		return lstAdjust;
	}
	public void setLstAdjust(BigDecimal lstAdjust) {
		this.lstAdjust = lstAdjust;
	}
	public BigDecimal getCtdAdjust() {
		return ctdAdjust;
	}
	public void setCtdAdjust(BigDecimal ctdAdjust) {
		this.ctdAdjust = ctdAdjust;
	}
	public BigDecimal getYtdRedeemed() {
		return ytdRedeemed;
	}
	public void setYtdRedeemed(BigDecimal ytdRedeemed) {
		this.ytdRedeemed = ytdRedeemed;
	}
	public BigDecimal getLstRedeemed() {
		return lstRedeemed;
	}
	public void setLstRedeemed(BigDecimal lstRedeemed) {
		this.lstRedeemed = lstRedeemed;
	}
	public BigDecimal getCtdRedeemed() {
		return ctdRedeemed;
	}
	public void setCtdRedeemed(BigDecimal ctdRedeemed) {
		this.ctdRedeemed = ctdRedeemed;
	}
	public BigDecimal getYtdAvailable() {
		return ytdAvailable;
	}
	public void setYtdAvailable(BigDecimal ytdAvailable) {
		this.ytdAvailable = ytdAvailable;
	}
	public BigDecimal getLstAvailable() {
		return lstAvailable;
	}
	public void setLstAvailable(BigDecimal lstAvailable) {
		this.lstAvailable = lstAvailable;
	}
	public BigDecimal getCtdAvailable() {
		return ctdAvailable;
	}
	public void setCtdAvailable(BigDecimal ctdAvailable) {
		this.ctdAvailable = ctdAvailable;
	}
	public String getRedemptionNumber() {
		return redemptionNumber;
	}
	public void setRedemptionNumber(String redemptionNumber) {
		this.redemptionNumber = redemptionNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public BigDecimal getPurePoints() {
		return purePoints;
	}
	public void setPurePoints(BigDecimal purePoints) {
		this.purePoints = purePoints;
	}
	public BigDecimal getFastTrackPoint() {
		return fastTrackPoint;
	}
	public void setFastTrackPoint(BigDecimal fastTrackPoint) {
		this.fastTrackPoint = fastTrackPoint;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public BigDecimal getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(BigDecimal deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getTotalPointRedeem() {
		return totalPointRedeem;
	}
	public void setTotalPointRedeem(BigDecimal totalPointRedeem) {
		this.totalPointRedeem = totalPointRedeem;
	}
	public BigDecimal getTotlAmountRedeemed() {
		return totlAmountRedeemed;
	}
	public void setTotlAmountRedeemed(BigDecimal totlAmountRedeemed) {
		this.totlAmountRedeemed = totlAmountRedeemed;
	}
	
	
	

}
