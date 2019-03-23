package com.ciyaz.hrpms.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 收入支出实体类
 *
 * @author CiyaZ
 */
public class InOutDetail implements Serializable
{
	private Long inoutDetailId;
	private String note;
	private Long typeId;
	private Double amount;
	private Long accountId;
	private Date date;

	public Long getInoutDetailId()
	{
		return inoutDetailId;
	}

	public void setInoutDetailId(Long inoutDetailId)
	{
		this.inoutDetailId = inoutDetailId;
	}

	public String getNote()
	{
		return note;
	}

	public void setNote(String note)
	{
		this.note = note;
	}

	public Long getTypeId()
	{
		return typeId;
	}

	public void setTypeId(Long typeId)
	{
		this.typeId = typeId;
	}

	public Double getAmount()
	{
		return amount;
	}

	public void setAmount(Double amount)
	{
		this.amount = amount;
	}

	public Long getAccountId()
	{
		return accountId;
	}

	public void setAccountId(Long accountId)
	{
		this.accountId = accountId;
	}

	public Date getDate()
	{
		return date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

	@Override
	public String toString()
	{
		return "InOutDetail{" +
				"inoutDetailId=" + inoutDetailId +
				", note='" + note + '\'' +
				", typeId=" + typeId +
				", amount=" + amount +
				", accountId=" + accountId +
				", date=" + date +
				'}';
	}
}
