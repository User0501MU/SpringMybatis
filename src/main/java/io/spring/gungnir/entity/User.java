package io.spring.gungnir.entity;
//エンティティクラス（データベースから取得したデータを格納するクラス）
import lombok.Data;

@Data
public class User {

    /*
     * ユーザー情報 entity
     */
    private String id;
    private String name;
    private String symphogear_name;

}
