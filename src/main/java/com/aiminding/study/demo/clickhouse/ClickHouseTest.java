package com.aiminding.study.demo.clickhouse;

import ru.yandex.clickhouse.ClickHouseConnection;
import ru.yandex.clickhouse.ClickHouseDataSource;
import ru.yandex.clickhouse.ClickHouseStatement;
import ru.yandex.clickhouse.settings.ClickHouseProperties;
import ru.yandex.clickhouse.settings.ClickHouseQueryParam;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class ClickHouseTest {

    public static void test() throws SQLException {
        String url = "jdbc:clickhouse://11.168.187.197:8123/creative_wide_table";
        ClickHouseProperties properties = new ClickHouseProperties();
        // set connection options - see more defined in ClickHouseConnectionSettings
        properties.setClientName("Agent #1");
        // set default request options - more in ClickHouseQueryParam
        properties.setSessionId("default-session-id");
        properties.setUser("agency_ch");
        properties.setPassword("PcwtLD2f");

        ClickHouseDataSource dataSource = new ClickHouseDataSource(url, properties);
        String sql = "select team, count(distinct adgroup_id), sum(cost) from cluster('clickhouse_teg_it5_test_1_replica', creative_wide_table.crve_wide_table) where partition_time=20210915 and autoderivedcreativestatus in (1,2,3) group by team;";
        Map<ClickHouseQueryParam, String> additionalDBParams = new HashMap<>();
        // set request options, which will override the default ones in ClickHouseProperties
        additionalDBParams.put(ClickHouseQueryParam.SESSION_ID, "new-session-id");
        try (ClickHouseConnection conn = dataSource.getConnection();
             ClickHouseStatement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql, additionalDBParams)) {
            System.out.println(rs);

        }
    }

}
