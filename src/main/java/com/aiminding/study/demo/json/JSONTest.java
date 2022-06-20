package com.aiminding.study.demo.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.logging.log4j.util.Strings;
import org.junit.Test;

import java.util.*;

public class JSONTest {

    @Test
    public void test22() {
        String str = "[[{\"name\": \"推广部-王丽娟\", \"userId\": 21537873}],[{\"userId\": 20489734}],[{\"userId\": 21539964}],[{\"name\": \"张峰\", \"userId\": 21540711}],[{\"userId\": 21541166}],[{\"userId\": 21543423}],[{\"userId\": 21543060}],[{\"userId\": 21544845}],[{\"userId\": 21545531}],[{\"userId\": 21545534}],[{\"userId\": 21546137}],[{\"userId\": 21547783}],[{\"name\": \"张英斌\", \"userId\": 21024447}],[{\"userId\": 21549231}],[{\"userId\": 21549831}],[{\"userId\": 21549641}],[{\"userId\": 21549740}],[{\"name\": \"一汽红旗\", \"userId\": 21551068}],[{\"userId\": 21551102}],[{\"userId\": 21551105}],[{\"userId\": 21551979}],[{\"userId\": 21551983}],[{\"userId\": 21551906}],[{\"userId\": 21551816}],[{\"userId\": 21551819}],[{\"userId\": 21552727}],[{\"userId\": 21554770}],[{\"userId\": 21554880}],[{\"userId\": 21555393}],[{\"userId\": 21555396}],[{\"userId\": 21559969}],[{\"userId\": 21559973}],[{\"userId\": 21561113}],[{\"userId\": 21561337}],[{\"name\": \"21562310\", \"userId\": 21562310}],[{\"userId\": 21562633}],[{\"userId\": 14223119}],[{\"name\": \"Wingyee\", \"userId\": 21567294}],[{\"userId\": 21567792}],[{\"userId\": 21567795}],[{\"userId\": 21567992}],[{\"userId\": 21567988}],[{\"userId\": 21568115}],[{\"userId\": 21568844}],[{\"userId\": 21568931}],[{\"userId\": 21569801}],[{\"userId\": 21570962}],[{\"userId\": 21571360}],[{\"userId\": 21571377}],[{\"name\": \"刘炜祎\", \"userId\": 21046789}],[{\"userId\": 21571995}],[{\"userId\": 21572755}],[{\"userId\": 18429718}],[{\"name\": \"华东-李雪\", \"userId\": 21575369}],[{\"name\": \"tan98_4\", \"userId\": 21575409}],[{\"userId\": 21576400}],[{\"userId\": 21577067}],[{\"name\": \"张晋玮\", \"userId\": 21578185}],[{\"userId\": 21581563}],[{\"userId\": 21581566}],[{\"userId\": 21581557}],[{\"name\": \"客户-360-马特\", \"userId\": 21583771}],[{\"userId\": 21584241}],[{\"userId\": 21584244}],[{\"name\": \"（安心佳科技）销售总监-王秋\", \"userId\": 21584724}],[{\"name\": \"KEHU \", \"userId\": 21584636}],[{\"name\": \"内容二部-主管-周勇\", \"userId\": 21585502}],[{\"name\": \"客户\", \"userId\": 21586889}],[{\"name\": \"客户\", \"userId\": 21586892}],[{\"name\": \"雅座客户\", \"userId\": 21586894}],[{\"name\": \"客户\", \"userId\": 21586880}],[{\"name\": \"小邋遢\", \"userId\": 21586913}],[{\"name\": \"客户\", \"userId\": 21586917}],[{\"name\": \"缙云电信-朱益军\", \"userId\": 21586916}],[{\"name\": \"刘思伟\", \"userId\": 21586941}],[{\"name\": \"客户\", \"userId\": 21586929}],[{\"name\": \"赵\", \"userId\": 21586830}],[{\"name\": \"客户--顺卓\", \"userId\": 21586847}],[{\"name\": \"客户\", \"userId\": 21586837}],[{\"name\": \"富友-顾汉奇\", \"userId\": 21586848}],[{\"name\": \"客户\", \"userId\": 21586877}],[{\"name\": \"陕西微米\", \"userId\": 21587284}],[{\"name\": \"12\", \"userId\": 21587224}],[{\"name\": \"客户\", \"userId\": 21587240}],[{\"userId\": 21587446}],[{\"name\": \"客户1\", \"userId\": 21587066}],[{\"name\": \"客户-运营\", \"userId\": 21586981}],[{\"name\": \"庄文静\", \"userId\": 21586994}],[{\"name\": \"薛文斌-众盈久诺\", \"userId\": 21587141}],[{\"name\": \"何超\", \"userId\": 21587159}],[{\"name\": \"张家林\", \"userId\": 21587187}],[{\"name\": \"朱江南-宣城志合广告\", \"userId\": 21587086}],[{\"name\": \"客户-赖佳勇\", \"userId\": 21587791}],[{\"name\": \"吴红羽和瑜伽馆\", \"userId\": 21587848}],[{\"userId\": 21588412}],[{\"userId\": 21589370}],[{\"userId\": 21589367}],[{\"userId\": 21589596}],[{\"name\": \"朱冲慧\", \"userId\": 21590169}],[{\"userId\": 21591359}],[{\"userId\": 21593440}],[{\"userId\": 21593443}],[{\"userId\": 21593098}],[{\"userId\": 21593095}],[{\"userId\": 21594370}],[{\"userId\": 21594541}],[{\"userId\": 21595986}],[{\"userId\": 21595989}],[{\"userId\": 21596049}],[{\"userId\": 21596489}],[{\"userId\": 21596485}],[{\"userId\": 21596825}],[{\"userId\": 21596822}],[{\"userId\": 21597214}],[{\"userId\": 21597218}],[{\"userId\": 103553}],[{\"userId\": 21600029}],[{\"userId\": 21601490}],[{\"userId\": 21601493}],[{\"userId\": 21606113}],[{\"userId\": 21608193}],[{\"userId\": 21608896}],[{\"name\": \"赵永超\", \"userId\": 21610191}],[{\"name\": \"21610635\", \"userId\": 21610635}],[{\"userId\": 21611330}],[{\"userId\": 21611149}],[{\"userId\": 21611575}],[{\"userId\": 21614456}],[{\"userId\": 21614947}],[{\"userId\": 21616482}],[{\"userId\": 21616485}],[{\"userId\": 21616953}],[{\"userId\": 21617202}],[{\"name\": \"21617205\", \"userId\": 21617205}],[{\"userId\": 21618085}],[{\"userId\": 21622700}],[{\"userId\": 21622695}],[{\"userId\": 21623092}],[{\"userId\": 21623095}],[{\"userId\": 21623181}],[{\"userId\": 21623184}],[{\"userId\": 10615567}],[{\"userId\": 21628942}],[{\"userId\": 21629637}],[{\"userId\": 21634409}],[{\"userId\": 21634404}],[{\"userId\": 21634864}],[{\"userId\": 21634711}],[{\"userId\": 21635469}],[{\"userId\": 21635198}],[{\"userId\": 21635201}],[{\"userId\": 21636705}],[{\"userId\": 21637446}],[{\"userId\": 21638562}],[{\"userId\": 21638565}],[{\"name\": \"李会涛\", \"userId\": 21687753}],[{\"userId\": 21175884}],[{\"userId\": 4935151}],[{\"name\": \"赫培艺\", \"userId\": 20664359}],[{\"name\": \"张桂源\", \"userId\": 20664339}],[{\"name\": \"王雪彦\", \"userId\": 20664324}],[{\"name\": \"胡智博\", \"userId\": 20664424}],[{\"userId\": 8093189}],[{\"userId\": 8099454}],[{\"userId\": 15446478}],[{\"userId\": 19126274}],[{\"userId\": 252428}],[{\"userId\": 7603560}],[{\"name\": \"陶奇（转岗渠道）\", \"userId\": 11273920}],[{\"name\": \"郑励玮\", \"userId\": 20749207}],[{\"name\": \"杨广亚\", \"userId\": 20778677}],[{\"name\": \"任梦菲\", \"userId\": 20778694}],[{\"name\": \"王梦瑶222\", \"userId\": 10828981}],[{\"userId\": 14507138}],[{\"name\": \"程航22\", \"userId\": 10842689}],[{\"name\": \"左亚琴（转岗渠道）\", \"userId\": 9800184}],[{\"userId\": 913687}],[{\"userId\": 20837147}],[{\"userId\": 922458}],[{\"name\": \"曾竟\", \"userId\": 20847417}],[{\"userId\": 1483793}],[{\"userId\": 17746677}],[{\"name\": \"刘艳\", \"userId\": 20896223}],[{\"userId\": 21422175}],[{\"userId\": 1520381}],[{\"name\": \"郑明霞\", \"userId\": 10974439}],[{\"name\": \"肖雄\", \"userId\": 10986222}],[{\"userId\": 18340607}],[{\"userId\": 9960494}]]";
        JSONArray jsonArray = JSONObject.parseArray(str);
        System.out.println(jsonArray.size());
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONArray jsonArray1 = jsonArray.getJSONArray(i);
            JSONObject jsonObject = jsonArray1.getJSONObject(0);
            String userId = jsonObject.getString("userId");
            System.out.println(userId);
        }
    }

    @Test
    public void test2223() {
        String s = "{\"code\":0,\"message\":\"\",\"data\":[{\"ad_creative_template_id\":\"1064\",\"ad_creative_template_name\":\"常规视频 750×1536\"},{\"ad_creative_template_id\":\"641\",\"ad_creative_template_name\":\"常规多图 1:1 三图\"},{\"ad_creative_template_id\":\"642\",\"ad_creative_template_name\":\"常规多图 1:1 四图\"},{\"ad_creative_template_id\":\"643\",\"ad_creative_template_name\":\"常规多图 1:1 六图\"},{\"ad_creative_template_id\":\"1465\",\"ad_creative_template_name\":\"常规视频 16:9\"},{\"ad_creative_template_id\":\"1480\",\"ad_creative_template_name\":\"常规视频 9:16\"},{\"ad_creative_template_id\":\"311\",\"ad_creative_template_name\":\"常规大图 1:1\"},{\"ad_creative_template_id\":\"955\",\"ad_creative_template_name\":\"行动卡片  横版大图16:9\"},{\"ad_creative_template_id\":\"957\",\"ad_creative_template_name\":\"行动卡片  横版视频16:9\"},{\"ad_creative_template_id\":\"720\",\"ad_creative_template_name\":\"横版视频 16:9\"},{\"ad_creative_template_id\":\"721\",\"ad_creative_template_name\":\"竖版视频 9:16\"},{\"ad_creative_template_id\":\"1708\",\"ad_creative_template_name\":\"卡片广告 横版视频 16:9\"},{\"ad_creative_template_id\":\"1707\",\"ad_creative_template_name\":\"卡片广告 横版大图 16:9\"},{\"ad_creative_template_id\":\"450\",\"ad_creative_template_name\":\"基础卡片 横版大图 16:9\"},{\"ad_creative_template_id\":\"452\",\"ad_creative_template_name\":\"基础卡片 横版视频 16:9\"},{\"ad_creative_template_id\":\"618\",\"ad_creative_template_name\":\"常规视频  4:3\"},{\"ad_creative_template_id\":\"588\",\"ad_creative_template_name\":\"标签卡片 横版大图 16:9\"},{\"ad_creative_template_id\":\"589\",\"ad_creative_template_name\":\"标签卡片 横版视频  16:9\"}]}";
        JSONObject jsonObject = JSONObject.parseObject(s);
        JSONArray data = jsonObject.getJSONArray("data");
        for (int i = 0; i < data.size(); i++) {
            JSONObject jsonObject1 = data.getJSONObject(i);
            System.out.println(jsonObject1.get("ad_creative_template_name"));
        }
    }

    @Test
    public void testId() {
        String s = "{\"code\":0,\"message\":\"\",\"data\":[{\"ad_creative_template_id\":\"910\",\"ad_creative_template_name\":\"激励浏览广告\"},{\"ad_creative_template_id\":\"998\",\"ad_creative_template_name\":\"960×540单图-公众号优雅大图\"},{\"ad_creative_template_id\":\"484\",\"ad_creative_template_name\":\"960×540单图(文)-公众号文中广告\"},{\"ad_creative_template_id\":\"1861\",\"ad_creative_template_name\":\"订阅号全幅式图片卡片\"},{\"ad_creative_template_id\":\"925\",\"ad_creative_template_name\":\"Banner图片 20:7\"},{\"ad_creative_template_id\":\"927\",\"ad_creative_template_name\":\"横版大图 16:9\"},{\"ad_creative_template_id\":\"929\",\"ad_creative_template_name\":\"横版视频 16:9\"},{\"ad_creative_template_id\":\"538\",\"ad_creative_template_name\":\"960×540视频-公众号底部优雅视频\"},{\"ad_creative_template_id\":\"1515\",\"ad_creative_template_name\":\"960×540视频-视频播放前图片广告\"},{\"ad_creative_template_id\":\"1885\",\"ad_creative_template_name\":\"破框形态 视频合约广告\"},{\"ad_creative_template_id\":\"711\",\"ad_creative_template_name\":\"横版大图 16:9\"},{\"ad_creative_template_id\":\"712\",\"ad_creative_template_name\":\"竖版大图 9:16\"},{\"ad_creative_template_id\":\"559\",\"ad_creative_template_name\":\"960×540视频-小程序激励式视频\"},{\"ad_creative_template_id\":\"560\",\"ad_creative_template_name\":\"竖版视频 9:16-小程序激励式视频\"},{\"ad_creative_template_id\":\"720\",\"ad_creative_template_name\":\"横版视频 16:9\"},{\"ad_creative_template_id\":\"567\",\"ad_creative_template_name\":\"960×334单图(文)-公众号文章底部广告\"},{\"ad_creative_template_id\":\"721\",\"ad_creative_template_name\":\"竖版视频 9:16\"},{\"ad_creative_template_id\":\"608\",\"ad_creative_template_name\":\"960×334单图(文)-小程序\"},{\"ad_creative_template_id\":\"972\",\"ad_creative_template_name\":\"格子广告-小程序底部\"},{\"ad_creative_template_id\":\"616\",\"ad_creative_template_name\":\"960×540单图-视频播放前图片广告\"},{\"ad_creative_template_id\":\"1846\",\"ad_creative_template_name\":\"PC鼠标轻互动\"},{\"ad_creative_template_id\":\"718\",\"ad_creative_template_name\":\"横版三小图 3:2\"},{\"ad_creative_template_id\":\"1529\",\"ad_creative_template_name\":\"闪屏视频 9:16\"},{\"ad_creative_template_id\":\"951\",\"ad_creative_template_name\":\"PC横版大图16:9\"},{\"ad_creative_template_id\":\"713\",\"ad_creative_template_name\":\"通栏大图 7:2\"},{\"ad_creative_template_id\":\"714\",\"ad_creative_template_name\":\"横版小图 3:2\"},{\"ad_creative_template_id\":\"722\",\"ad_creative_template_name\":\"贴片视频 16:9\"},{\"ad_creative_template_id\":\"965\",\"ad_creative_template_name\":\"PC横版通栏 100:9\"},{\"ad_creative_template_id\":\"716\",\"ad_creative_template_name\":\"横版小图 16:9\"},{\"ad_creative_template_id\":\"311\",\"ad_creative_template_name\":\"常规大图 1:1\"},{\"ad_creative_template_id\":\"717\",\"ad_creative_template_name\":\"方形大图 1:1\"},{\"ad_creative_template_id\":\"727\",\"ad_creative_template_name\":\"卡券广告\"},{\"ad_creative_template_id\":\"730\",\"ad_creative_template_name\":\"应用分发位\"},{\"ad_creative_template_id\":\"876\",\"ad_creative_template_name\":\"QQ消息-基础\"},{\"ad_creative_template_id\":\"877\",\"ad_creative_template_name\":\"QQ消息-视频\"},{\"ad_creative_template_id\":\"878\",\"ad_creative_template_name\":\"QQ消息-橱窗\"},{\"ad_creative_template_id\":\"643\",\"ad_creative_template_name\":\"常规多图 1:1 六图\"},{\"ad_creative_template_id\":\"1030\",\"ad_creative_template_name\":\"多宫格1:1\"},{\"ad_creative_template_id\":\"960\",\"ad_creative_template_name\":\"横版大图 16:9\"},{\"ad_creative_template_id\":\"961\",\"ad_creative_template_name\":\"PC方形大图 1:1\"},{\"ad_creative_template_id\":\"964\",\"ad_creative_template_name\":\"PC横版焦点图 7:2\"},{\"ad_creative_template_id\":\"968\",\"ad_creative_template_name\":\"PC 文字链\"},{\"ad_creative_template_id\":\"1064\",\"ad_creative_template_name\":\"常规视频 750×1536\"},{\"ad_creative_template_id\":\"641\",\"ad_creative_template_name\":\"常规多图 1:1 三图\"},{\"ad_creative_template_id\":\"642\",\"ad_creative_template_name\":\"常规多图 1:1 四图\"},{\"ad_creative_template_id\":\"1465\",\"ad_creative_template_name\":\"常规视频 16:9\"},{\"ad_creative_template_id\":\"1480\",\"ad_creative_template_name\":\"常规视频 9:16\"},{\"ad_creative_template_id\":\"955\",\"ad_creative_template_name\":\"行动卡片  横版大图16:9\"},{\"ad_creative_template_id\":\"957\",\"ad_creative_template_name\":\"行动卡片  横版视频16:9\"},{\"ad_creative_template_id\":\"1708\",\"ad_creative_template_name\":\"卡片广告 横版视频 16:9\"},{\"ad_creative_template_id\":\"1707\",\"ad_creative_template_name\":\"卡片广告 横版大图 16:9\"},{\"ad_creative_template_id\":\"450\",\"ad_creative_template_name\":\"基础卡片 横版大图 16:9\"},{\"ad_creative_template_id\":\"452\",\"ad_creative_template_name\":\"基础卡片 横版视频 16:9\"},{\"ad_creative_template_id\":\"618\",\"ad_creative_template_name\":\"常规视频  4:3\"},{\"ad_creative_template_id\":\"588\",\"ad_creative_template_name\":\"标签卡片 横版大图 16:9\"},{\"ad_creative_template_id\":\"589\",\"ad_creative_template_name\":\"标签卡片 横版视频  16:9\"}]}";
        JSONObject jsonObject = JSONObject.parseObject(s);
        JSONArray data = jsonObject.getJSONArray("data");
        Set<String> id = new HashSet<>();
        for (int i = 0; i < data.size(); i++) {
            JSONObject object = data.getJSONObject(i);
            id.add(object.getString("ad_creative_template_id"));
        }

        String s2 = "{\"monitor_target\":\"AD\",\"field\":\"creative_template_id\",\"field_name\":\"创意规格\",\"operators\":[\"IN\"],\"type\":\"long\",\"value_details\":[{\"key\":\"CPS商品广告空创意形式\",\"value\":\"1009\"},{\"key\":\"腾讯视频_PC_loading\",\"value\":\"1018\"},{\"key\":\"900×500单图(文)\",\"value\":\"276\"},{\"key\":\"腾讯视频创意中插\",\"value\":\"786\"},{\"key\":\"640*960图片\",\"value\":\"79\"},{\"key\":\"腾讯视频贴片暂停\",\"value\":\"810\"},{\"key\":\"腾讯视频冠名小LOGO(清晰度、倍速)\",\"value\":\"970\"},{\"key\":\"视频超级蒙层\",\"value\":\"976\"},{\"key\":\"800×450\",\"value\":\"979\"},{\"key\":\"640×360\",\"value\":\"980\"},{\"key\":\"1442×618\",\"value\":\"981\"},{\"key\":\"下载卡片(167)\",\"value\":\"167\"},{\"key\":\"朋友圈常规图片(666)\",\"value\":\"666\"},{\"key\":\"朋友圈常规横版视频(888)\",\"value\":\"888\"},{\"key\":\"朋友圈选择图片(480)\",\"value\":\"480\"},{\"key\":\"朋友圈选择视频(482)\",\"value\":\"482\"},{\"key\":\"朋友圈投票图片(516)\",\"value\":\"516\"},{\"key\":\"全屏卡片图文(598)\",\"value\":\"598\"},{\"key\":\"朋友圈全幅视频(599)\",\"value\":\"599\"},{\"key\":\"CPS(1501)\",\"value\":\"1501\"},{\"key\":\"朋友圈滑动式视频(698)\",\"value\":\"698\"},{\"key\":\"朋友圈全景图片(699)\",\"value\":\"699\"},{\"key\":\"QQ空间\",\"value\":\"388\"},{\"key\":\"QQ客户端\",\"value\":\"25\"},{\"key\":\"文字链\",\"value\":\"406\"},{\"key\":\"PC方形大图, 1:1\",\"value\":\"961\"},{\"key\":\"QQ空间及QQ\",\"value\":\"585\"},{\"key\":\"960×540视频\",\"value\":\"488\"},{\"key\":\"移动Banner\",\"value\":\"89\"},{\"key\":\"横版大图, 16:9\",\"value\":\"421\"},{\"key\":\"常规多图, 40:71, 六图\",\"value\":\"649\"},{\"key\":\"QQ消息-视频\",\"value\":\"877\"},{\"key\":\"常规大图, 4:5\",\"value\":\"310\"},{\"key\":\"ADQ端:640×360投票视频,MP端:朋友圈投票视频(519)\",\"value\":\"519\"},{\"key\":\"悦图大图\",\"value\":\"493\"},{\"key\":\"下拉展开大卡图片\",\"value\":\"1753\"},{\"key\":\"ADQ端:朋友圈广告全卡轮播_多视频,MP端:卡片轮播视频（1765）\",\"value\":\"1765\"},{\"key\":\"ADQ端:基础卡片 横版大图, 16:9,MP端:朋友圈基础图片(450)\",\"value\":\"450\"},{\"key\":\"卡券广告\",\"value\":\"727\"},{\"key\":\"QQ-加群广告-外链\",\"value\":\"1043\"},{\"key\":\"ADQ端:常规视频 9:16,MP端:朋友圈常规竖版视频1334(1480)\",\"value\":\"1480\"},{\"key\":\"ADQ端:960×540单图(文),MP端:文中图文卡片(841)\",\"value\":\"841\"},{\"key\":\"多宫格1:1\",\"value\":\"1030\"},{\"key\":\"腾讯视频\",\"value\":\"551\"},{\"key\":\"ADQ端:常规视频 750×1536,MP端:朋友圈常规竖版视频(1064)\",\"value\":\"1064\"},{\"key\":\"横版焦点图, 7:2\",\"value\":\"66\"},{\"key\":\"ADQ端:标签卡片 横版视频  16:9,MP端:朋友圈标签视频(589)\",\"value\":\"589\"},{\"key\":\"横版大图, 16:9\",\"value\":\"711\"},{\"key\":\"腾讯新闻信息流大图-C2S\",\"value\":\"1034\"},{\"key\":\"竖版视频封面拼接闪屏b\",\"value\":\"1784\"},{\"key\":\"微视闪屏-oneshot(topview)\",\"value\":\"1536\"},{\"key\":\"QQ空间及浏览器\",\"value\":\"449\"},{\"key\":\"960×274单图(文)\",\"value\":\"487\"},{\"key\":\"ADQ端:竖版大图, 3:4,MP端:视频号竖屏图片1531\",\"value\":\"1531\"},{\"key\":\"ADQ端:465×230单图(文),MP端:底部图片名片banner(117)\",\"value\":\"117\"},{\"key\":\"文字链\",\"value\":\"87\"},{\"key\":\"手机管家及WiFi管家单图(文)\",\"value\":\"586\"},{\"key\":\"ADQ端:640×316单图(文),MP端:小程序图片名片banner(556)\",\"value\":\"556\"},{\"key\":\"原创视频前贴(6s视频)\",\"value\":\"617\"},{\"key\":\"腾讯新闻和腾讯视频\",\"value\":\"709\"},{\"key\":\"腾讯新闻\",\"value\":\"512\"},{\"key\":\"信息流图文超级背景广告\",\"value\":\"969\"},{\"key\":\"QQ空间\",\"value\":\"400\"},{\"key\":\"ADQ端:卡片广告, 横版大图, 16:9,MP端:朋友圈卡片组合式图片(1707)\",\"value\":\"1707\"},{\"key\":\"横版大图, 16:9\",\"value\":\"19\"},{\"key\":\"移动插屏\",\"value\":\"113\"},{\"key\":\"ADQ端:690×240单图(文),MP端:单图卡片(355)\",\"value\":\"355\"},{\"key\":\"690×240单图(文)\",\"value\":\"558\"},{\"key\":\"PC, 文字链\",\"value\":\"968\"},{\"key\":\"横版大图, 16:9\",\"value\":\"21\"},{\"key\":\"QQ音乐\",\"value\":\"422\"},{\"key\":\"品牌优选-边看边买\",\"value\":\"1010\"},{\"key\":\"微信普通视频广告(不带长视频), 或者, 微信原生视频广告(第一类原生视频)\",\"value\":\"460\"},{\"key\":\"QQ空间及QQ\",\"value\":\"185\"},{\"key\":\"960×540单图\",\"value\":\"616\"},{\"key\":\"常规视频, 16:9\",\"value\":\"1465\"},{\"key\":\"移动Banner\",\"value\":\"69\"},{\"key\":\"ADQ端:公众号底部本地新样式,MP端:底部图文卡片(904)\",\"value\":\"904\"},{\"key\":\"1280×720多图, (文)\",\"value\":\"148\"},{\"key\":\"2, 竖版大图, 9:16\",\"value\":\"2\"},{\"key\":\"690×140单图(文)\",\"value\":\"357\"},{\"key\":\"ADQ端:横版大图, 16:9,MP端:通投大图(927)\",\"value\":\"927\"},{\"key\":\"ADQ端:行动卡片 , 横版视频16:9,MP端:朋友圈行动视频(957)\",\"value\":\"957\"},{\"key\":\"147×147_图文\",\"value\":\"194\"},{\"key\":\"移动开屏\",\"value\":\"467\"},{\"key\":\"ADQ端:标签卡片 横版大图 16:9,MP端:朋友圈标签图片(588)\",\"value\":\"588\"},{\"key\":\"横版三小图, 3:2\",\"value\":\"718\"},{\"key\":\"腾讯新闻信息流视频-C2S\",\"value\":\"1035\"},{\"key\":\"ADQ端:960×334单图(文),MP端:底部图片banner(567)\",\"value\":\"567\"},{\"key\":\"腾讯视频\",\"value\":\"680\"},{\"key\":\"横版焦点图, 7:2\",\"value\":\"22\"},{\"key\":\"信息流-橱窗翻转\",\"value\":\"1025\"},{\"key\":\"ADQ端:960×540视频,MP端:激励16:9视频(559)\",\"value\":\"559\"},{\"key\":\"移动插屏\",\"value\":\"70\"},{\"key\":\"应用分发位\",\"value\":\"730\"},{\"key\":\"ADQ端:960×540单图,MP端:底部及互选大图卡片(998)\",\"value\":\"998\"},{\"key\":\"文字链\",\"value\":\"44\"},{\"key\":\"ADQ端:基础卡片 横版视频 16:9,MP端:朋友圈基础视频(452)\",\"value\":\"452\"},{\"key\":\"全景广告\",\"value\":\"726\"},{\"key\":\"腾讯视频\",\"value\":\"563\"},{\"key\":\"闪屏视频, 9:16\",\"value\":\"1529\"},{\"key\":\"横版三小图, 4:3\",\"value\":\"719\"},{\"key\":\"QQ消息-基础\",\"value\":\"876\"},{\"key\":\"惊喜满溢-破格联动\",\"value\":\"1028\"},{\"key\":\"TV退出应用横幅\",\"value\":\"1460\"},{\"key\":\"拟人化-图文视频\",\"value\":\"1483\"},{\"key\":\"文字链(移动14字)\",\"value\":\"29\"},{\"key\":\"582×166单图(文)\",\"value\":\"193\"},{\"key\":\"QQ空间\",\"value\":\"394\"},{\"key\":\"手Q看点首页大图样式_1000×560图文\",\"value\":\"600\"},{\"key\":\"QQ消息-橱窗\",\"value\":\"878\"},{\"key\":\"1, 横版大图16:9\",\"value\":\"1\"},{\"key\":\"ADQ端:582×166单图(文),MP端:小程序特有图片(532)\",\"value\":\"532\"},{\"key\":\"PC横版通栏100:9\",\"value\":\"199\"},{\"key\":\"ADQ端:690×240单图(文),MP端:底部文案banner(354)\",\"value\":\"354\"},{\"key\":\"230×152多图(文)\",\"value\":\"473\"},{\"key\":\"ADQ端:582×166单图(文),MP端:底部图片banner(133)\",\"value\":\"133\"},{\"key\":\"竖版视频封面拼接闪屏y\",\"value\":\"1782\"},{\"key\":\"QQ空间、QQ、浏览器\",\"value\":\"65\"},{\"key\":\"ADQ端:18字文字链,MP端:底部名片及卡券banner(135)\",\"value\":\"135\"},{\"key\":\"竖版视频, 9:16\",\"value\":\"934\"},{\"key\":\"腾讯新闻信息流大图_640*246\",\"value\":\"472\"},{\"key\":\"ADQ端:朋友圈扭动式卡片,MP端:朋友圈扭动轻互动视频(1733)\",\"value\":\"1733\"},{\"key\":\"腾讯新闻和腾讯视频\",\"value\":\"625\"},{\"key\":\"浏览器动态商品广告_240*180\",\"value\":\"469\"},{\"key\":\"ADQ端:微信,MP端:通投(570)\",\"value\":\"570\"},{\"key\":\"PC横版大图16:9\",\"value\":\"951\"},{\"key\":\"ADQ端:腾讯新闻,MP端:贴片图片(555)\",\"value\":\"555\"},{\"key\":\"常规多图, 2:3, 三图\",\"value\":\"644\"},{\"key\":\"方形大图轮播, 1:1\",\"value\":\"724\"},{\"key\":\"ADQ端:激励浏览广告,MP端:激励浏览(910)\",\"value\":\"910\"},{\"key\":\"方形大图, 1:1\",\"value\":\"717\"},{\"key\":\"QQ浏览器全景广告\",\"value\":\"515\"},{\"key\":\"Imax, 视频\",\"value\":\"930\"},{\"key\":\"浏览器、QQ、手腾网\",\"value\":\"285\"},{\"key\":\"ADQ端:竖版视频, 9:16,MP端:激励9:16视频(560)\",\"value\":\"560\"},{\"key\":\"常规视频  4:3\",\"value\":\"618\"},{\"key\":\"常规多图, 40:71, 四图\",\"value\":\"648\"},{\"key\":\"通栏大图, 7:2\",\"value\":\"713\"},{\"key\":\"大图随心互动\",\"value\":\"725\"},{\"key\":\"贴片视频, 16:9\",\"value\":\"722\"},{\"key\":\"常规大图, 1:1\",\"value\":\"311\"},{\"key\":\"PC竖版小图, 140:425\",\"value\":\"967\"},{\"key\":\"ADQ端:960×540视频,MP端:贴片视频(1515)\",\"value\":\"1515\"},{\"key\":\"常规大图, 5:4\",\"value\":\"263\"},{\"key\":\"ADQ端:横版视频, 16:9,MP端:通投视频(929)\",\"value\":\"929\"},{\"key\":\"followU-沉浸图片和视频\",\"value\":\"1526\"},{\"key\":\"横版大图, 16:9\",\"value\":\"108\"},{\"key\":\"960×128单图(文)\",\"value\":\"561\"},{\"key\":\"960×274单图(文)\",\"value\":\"611\"},{\"key\":\"腾讯视频及腾讯新闻等-闪屏-信息流变形金刚专用\",\"value\":\"1747\"},{\"key\":\"横版视频, 16:9\",\"value\":\"720\"},{\"key\":\"140×40, QQ聊天窗左下图片\",\"value\":\"24\"},{\"key\":\"常规多图, 2:3, 六图\",\"value\":\"646\"},{\"key\":\"闪屏-纯静态\",\"value\":\"793\"},{\"key\":\"信息流图文_双选, \",\"value\":\"924\"},{\"key\":\"ADQ端:960x540单图(文),MP端:插屏图片(701)\",\"value\":\"701\"},{\"key\":\"16：9-ott复用\",\"value\":\"1764\"},{\"key\":\"900×500多图(文)\",\"value\":\"278\"},{\"key\":\"900×500多图(文)\",\"value\":\"494\"},{\"key\":\"1080×1920多图(文)\",\"value\":\"541\"},{\"key\":\"腾讯新闻信息流三小图-C2S\",\"value\":\"1036\"},{\"key\":\"ADQ端:960×540单图(文),MP端:文中图片卡片(484)\",\"value\":\"484\"},{\"key\":\"960×540单图(文)\",\"value\":\"486\"},{\"key\":\"ADQ端:朋友圈长按轻互动卡片,MP端:朋友圈长按式视频(1065)\",\"value\":\"1065\"},{\"key\":\"230×152单图(文)\",\"value\":\"471\"},{\"key\":\"横版视频封面拼接闪屏b\",\"value\":\"1781\"},{\"key\":\"移动Banner\",\"value\":\"10\"},{\"key\":\"移动插屏\",\"value\":\"59\"},{\"key\":\"方形小图, 1:1\",\"value\":\"94\"},{\"key\":\"手机QQ及浏览器\",\"value\":\"184\"},{\"key\":\"324×204多图(文)\",\"value\":\"443\"},{\"key\":\"640×360视频\",\"value\":\"468\"},{\"key\":\"9, 横版焦点图, 7:2\",\"value\":\"9\"},{\"key\":\"浏览器及管家单图(文)\",\"value\":\"361\"},{\"key\":\"8, QQ空间\",\"value\":\"8\"},{\"key\":\"640*100, 图片_站内\",\"value\":\"53\"},{\"key\":\"NOW直播APP\",\"value\":\"574\"},{\"key\":\"1280×720视频\",\"value\":\"351\"},{\"key\":\"690×140单图(文)\",\"value\":\"356\"},{\"key\":\"移动原生\",\"value\":\"470\"},{\"key\":\"闪屏图片9:16\",\"value\":\"813\"},{\"key\":\"横版视频封面拼接闪屏y\",\"value\":\"1779\"},{\"key\":\"ADQ端:朋友圈广告全卡轮播_多图,MP端:卡片轮播图片（1766）\",\"value\":\"1766\"},{\"key\":\"横版大图拼接闪屏视频, 9:16, a\",\"value\":\"1789\"},{\"key\":\"240×180单图(文)）\",\"value\":\"345\"},{\"key\":\"横版小图, 4:3\",\"value\":\"715\"},{\"key\":\"ADQ端:朋友圈话题式卡片,MP端:朋友圈视频号活动视频[1748]1\",\"value\":\"1748\"},{\"key\":\"ADQ端:114×114单图(文),MP端:底部图文banner(134)\",\"value\":\"134\"},{\"key\":\"ADQ端:微信公众号底部,MP端:底部图片卡片(708)\",\"value\":\"708\"},{\"key\":\"闪屏轻互动\",\"value\":\"792\"},{\"key\":\"ADQ端:卡片广告, 横版视频, 16:9,MP端:朋友圈卡片组合式视频(1708)\",\"value\":\"1708\"},{\"key\":\"移动插屏\",\"value\":\"115\"},{\"key\":\"ADQ端:格子广告,MP端:通投格子(972)\",\"value\":\"972\"},{\"key\":\"ADQ端:640×360单图(文),MP端:底部标签banner(677)\",\"value\":\"677\"},{\"key\":\"QQ\",\"value\":\"703\"},{\"key\":\"PC竖版大图, 9:16\",\"value\":\"966\"},{\"key\":\"横版大图, 16:9\",\"value\":\"1508\"},{\"key\":\"横版小图, 3:2\",\"value\":\"16\"},{\"key\":\"横版小图, 16:9\",\"value\":\"716\"},{\"key\":\"PC横版焦点图, 7:2\",\"value\":\"964\"},{\"key\":\"竖版大图, 9:16\",\"value\":\"150\"},{\"key\":\"640×1136单图(文)\",\"value\":\"316\"},{\"key\":\"QQ音乐\",\"value\":\"529\"},{\"key\":\"ADQ端:微信,MP端:关注图片卡片(568)\",\"value\":\"568\"},{\"key\":\"ADQ端:大图展示广告,MP端:通投关注大图(928)\",\"value\":\"928\"},{\"key\":\"ADQ端:960×540视频,MP端:底部及小程序视频卡片(538)\",\"value\":\"538\"},{\"key\":\"惊喜满溢-双图联动\",\"value\":\"1027\"},{\"key\":\"ADQ端:172×172单图(文),MP端:底部商品banner(267)\",\"value\":\"267\"},{\"key\":\"QQ\",\"value\":\"433\"},{\"key\":\"常规多图, 2:3, 四图\",\"value\":\"645\"},{\"key\":\"横版小图, 3:2\",\"value\":\"714\"},{\"key\":\"750x100单图(文)\",\"value\":\"562\"},{\"key\":\"QQ消息-标签\",\"value\":\"879\"},{\"key\":\"ADQ端:Banner展示广告,MP端:通投关注图片banner(926)\",\"value\":\"926\"},{\"key\":\"1280×720_视频_topview闪屏\",\"value\":\"1015\"},{\"key\":\"QQ客户端\",\"value\":\"155\"},{\"key\":\"14字文字链\",\"value\":\"254\"},{\"key\":\"竖版大图, 9:16\",\"value\":\"712\"},{\"key\":\"移动插屏\",\"value\":\"90\"},{\"key\":\"横版大图, 16:9\",\"value\":\"960\"},{\"key\":\"移动Banner\",\"value\":\"466\"},{\"key\":\"640*288图文_QQ浏览器\",\"value\":\"210\"},{\"key\":\"常规多图, 1:1, 六图\",\"value\":\"643\"},{\"key\":\"NOW直播位置\",\"value\":\"731\"},{\"key\":\"ADQ端:微信,MP端:底部卡片(569)\",\"value\":\"569\"},{\"key\":\"ADQ端:横版大图, 4:3,MP端:视频号横屏图片1530\",\"value\":\"1530\"},{\"key\":\"常规多图, 1:1, 三图\",\"value\":\"641\"},{\"key\":\"品牌优选大图\",\"value\":\"1510\"},{\"key\":\"900×500单图(文)\",\"value\":\"495\"},{\"key\":\"140×101单图(文)\",\"value\":\"323\"},{\"key\":\"腾讯新闻\",\"value\":\"502\"},{\"key\":\"长形大图轮播, 16:9\",\"value\":\"723\"},{\"key\":\"640×960单图(文)\",\"value\":\"315\"},{\"key\":\"翻转式视频卡片, 1:1\",\"value\":\"540\"},{\"key\":\"ADQ端:行动卡片 , 横版大图16:9,MP端:朋友圈行动图片(955)\",\"value\":\"955\"},{\"key\":\"PC横版通栏, 100:9\",\"value\":\"965\"},{\"key\":\"手机QQ天气内容页中部\",\"value\":\"492\"},{\"key\":\"PC方形小图, 1:1\",\"value\":\"963\"},{\"key\":\"常规多图, 1:1, 四图\",\"value\":\"642\"},{\"key\":\"ADQ端:960×334单图(文),MP端:小程序图片banner(608)\",\"value\":\"608\"},{\"key\":\"ADQ端:竖版视频, 9:16,MP端:竖版视频720(721)\",\"value\":\"721\"},{\"key\":\"QQ空间\",\"value\":\"382\"},{\"key\":\"单图160×120\",\"value\":\"27\"},{\"key\":\"移动Banner\",\"value\":\"71\"},{\"key\":\"140×425单图(文)\",\"value\":\"96\"},{\"key\":\"横版视频, 16:9\",\"value\":\"933\"},{\"key\":\"横版大图拼接闪屏视频, 9:16, b\",\"value\":\"1788\"},{\"key\":\"720×1280视频\",\"value\":\"875\"},{\"key\":\"1280x720视频\",\"value\":\"923\"},{\"key\":\"ADQ端:Banner图片, 20:7,MP端:通投图片banner(925)\",\"value\":\"925\"},{\"key\":\"720×1280视频\",\"value\":\"639\"},{\"key\":\"常规多图, 40:71, 三图\",\"value\":\"647\"},{\"key\":\"QQ音乐及QQ空间等单图(文)\",\"value\":\"710\"},{\"key\":\"PC, 横版小图, 3:2\",\"value\":\"962\"},{\"key\":\"腾讯新闻原生信息流-C2S\",\"value\":\"1032\"},{\"key\":\"640*200图文_QQ浏览器\",\"value\":\"215\"},{\"key\":\"ADQ端:小程序封面广告,MP端:封面图片(1003)\",\"value\":\"1003\"},{\"key\":\"横版视频, 16:9\",\"value\":\"1505\"},{\"key\":\"9:16闪屏图片\",\"value\":\"601\"},{\"key\":\"1280×720视频\",\"value\":\"612\"},{\"key\":\"ADQ端:微信小程序插屏广告,MP端:插屏视频(913)\",\"value\":\"913\"},{\"key\":\"直播氛围大卡\",\"value\":\"1751\"},{\"key\":\"312×312多图(文)\",\"value\":\"445\"}]}";
        JSONObject jsonObject1 = JSONObject.parseObject(s2);
        JSONArray value_details = jsonObject1.getJSONArray("value_details");
        Set<String> id2 = new HashSet<>();
        for (int i = 0; i < value_details.size(); i++) {
            JSONObject object = value_details.getJSONObject(i);
            id2.add(object.getString("value"));
        }
        // 差集
        Set<String> diff = new HashSet<>();
        diff.addAll(id);
        diff.removeAll(id2);
        System.out.println("新规格有，老规格没有的");
        diff.stream().forEach(item -> System.out.println(item));

        Set<String> diff2 = new HashSet<>();
        diff2.addAll(id2);
        diff2.removeAll(id);
        System.out.println("老规格有，新规格没有的");
        diff2.stream().forEach(item -> System.out.println(item));
    }

    @Test
    public void mapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "ding");
        map.put("id", "1");

        String msg = String.format("param = %s", JSONObject.toJSONString(map));
        System.out.println(msg);
    }

    @Test
    public void test() {
        String msg = "{\"account_id\":5983556,\"account_type\":1,\"advertiser\":{\"industry_id\":21474837107,\"agency_account_id\":78384}}";
        JSONObject jsonObject = JSONObject.parseObject(msg);
        Long accountId = jsonObject.getLong("account_id");
        Long accountType = jsonObject.getLong("account_type");
        JSONObject advertiser = jsonObject.getJSONObject("advertiser");
        Long agencyAccountId = advertiser.getLong("agency_account_id");
        System.out.println(accountId);
        System.out.println(accountType);
        System.out.println(agencyAccountId);
        System.out.println(accountType.equals(1L));
        System.out.println(agencyAccountId > 0);
        if (accountType.equals(1L) && agencyAccountId > 0) {
            // 只针对子客进行处理
            System.out.println("子客");
        }
    }

    @Test
    public void test2() {
        String msg = "{\"code\":0,\"message_cn\":\"站内信成功写入队列\",\"message\":\"success\"}";
        JSONObject res = JSON.parseObject(msg);
        if (!Objects.isNull(res)) {
            Integer code = res.getInteger("code");
            if (!Objects.isNull(code) && code.equals(0)) {
                System.out.println("ddd");
            }
        }
    }
}