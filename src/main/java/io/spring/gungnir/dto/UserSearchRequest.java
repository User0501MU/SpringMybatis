package io.spring.gungnir.dto;
//DTOクラス（画面からのリクエストデータを格納（転送）するクラス）
//DTO（データ転送オブジェクト）：データのやり取り専用で、シンプルなデータ入れ物。ビジネスロジックは入れへん。
import java.io.Serializable;

import lombok.Data;

    @Data //セッター、ゲッターを記述しなくても使用できるようになる
    public class UserSearchRequest implements Serializable{

        private String id;
        private String name;
        private String symphogear_name;
    }
