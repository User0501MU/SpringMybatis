mysql -u root -p
・データーベース一覧表示
mysql> SHOW DATABASES;

・データーベース作成
mysql> CREATE DATABASE SpringMybatis;

--テーブル内を確認（この時点で作成されていない）
SELECT * FROM springmybatis;
--playersがあれば削除(ないのでテーブルを作成）
DROP TABLE IF EXISTS symphogear_players;

・テーブル作成
mysql> CREATE TABLE IF NOT EXISTS symphogear_players(
    -> id VARCHAR(20) NOT NULL,
    -> name VARCHAR(20) NOT NULL,
    -> symphogear_name VARCHAR(20) NOT NULL,
    -> PRIMARY KEY(id)
    -> );
Query OK, 0 rows affected (0.04 sec)

・テーブル内容確認
mysql> SELECT * FROM symphogear_players;

___________________________________________________
UserMapper.java
//★symphogear_playersがテーブル
    @Insert("INSERT INTO symphogear_players(id,name,symphogear_name)"
            + "VALUES (#{id},#{name},#{symphogear_name})")
    void create(UserSearchRequest userAdd);
