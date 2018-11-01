package com.gao.mybatis.enums;

public enum Sex {
	 MALE(0, "男"),
	 FMALE(1, "女");
	
	 //用于保存在数据库
    private int SexCode;
    //用于UI展示
    private String SexName;

    Sex(int sexCode, String sexName) {
        SexCode = sexCode;
        SexName = sexName;
    }

    public int getSexCode() {
        return SexCode;
    }

//通过SexCode的值来获取Sex枚举类型，数据库只需保存code，通过代码解析成Sex类型
    public static Sex getSexFromCode(int code) {
        for (Sex sex : Sex.values()) {
            if (sex.getSexCode() == code) {
                return sex;
            }
        }
        return null;
    }

}
