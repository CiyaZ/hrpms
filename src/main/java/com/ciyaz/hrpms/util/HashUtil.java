package com.ciyaz.hrpms.util;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @author CiyaZ
 */
public class HashUtil
{
	public static String HEX_SALT = "<JtpB@2#ZA_6O92";

	public static String getStrHash(String str)
	{
		return DigestUtils.sha256Hex(str + HEX_SALT);
	}
}
