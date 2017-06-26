package cn.sqhl.shop.core;

import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.TypeHandler;

import cn.sqhl.shop.utils.DateHelper;

@MappedJdbcTypes(JdbcType.TIMESTAMP) 
public class ClobTypeHandler implements TypeHandler<Object>{

	@Override
	public Object getResult(ResultSet arg0, String arg1) throws SQLException {
		Clob clob=arg0.getClob(arg1);
		if(clob!=null && clob.length()>0){
			return clob.toString();
		}else{
			return null;
		}
	}

	@Override
	public Object getResult(ResultSet arg0, int arg1) throws SQLException {
		Clob clob=arg0.getClob(arg1);
		if(clob!=null && clob.length()>0){
			return clob.toString();
		}else{
			return null;
		}
	}

	@Override
	public Object getResult(CallableStatement arg0, int arg1) throws SQLException {
		
		String dateval =arg0.getString(arg1);
		if(StringUtils.isNotEmpty(dateval)){
			return new java.sql.Date(DateHelper.stringToTime(dateval).getTime());
		}else{
			return null;
		}
	}

	@Override
	public void setParameter(PreparedStatement arg0, int arg1, Object arg2,
			JdbcType arg3) throws SQLException {
		String dateval=(String)arg2;
		if(StringUtils.isNotEmpty(dateval)){
			java.sql.Date value=new java.sql.Date(DateHelper.stringToTime(dateval).getTime());
			arg0.setDate(arg1, value);
		}else{
			arg0.setDate(arg1, null);
		}
	}

}
