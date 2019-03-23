package com.ciyaz.hrpms.domain;

import java.io.Serializable;

/**
 * 收入支出类型
 *
 * @author CiyaZ
 */
public class inOutType implements Serializable
{
	private Long inOutTypeId;
	private String inOutTypeName;

	public Long getInOutTypeId()
	{
		return inOutTypeId;
	}

	public void setInOutTypeId(Long inOutTypeId)
	{
		this.inOutTypeId = inOutTypeId;
	}

	public String getInOutTypeName()
	{
		return inOutTypeName;
	}

	public void setInOutTypeName(String inOutTypeName)
	{
		this.inOutTypeName = inOutTypeName;
	}

	@Override
	public String toString()
	{
		return "inOutType{" +
				"inOutTypeId=" + inOutTypeId +
				", inOutTypeName='" + inOutTypeName + '\'' +
				'}';
	}
}
