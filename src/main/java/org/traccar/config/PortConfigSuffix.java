/*
 * Copyright 2024 - 2025 Anton Tananaev (anton@traccar.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.traccar.config;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PortConfigSuffix extends ConfigSuffix<Integer> {

    private static final Map<String, Integer> PORTS = new HashMap<>();

    static {
        PORTS.put("gps103", 5001);
        PORTS.put("tk103", 5002);
        PORTS.put("gl100", 5003);
        PORTS.put("gl200", 5004);
        PORTS.put("t55", 5005);
        PORTS.put("xexun", 5006);
        PORTS.put("totem", 5007);
        PORTS.put("enfora", 5008);
        PORTS.put("meiligao", 5009);
        PORTS.put("trv", 5010);
        PORTS.put("suntech", 5011);
        PORTS.put("progress", 5012);
        PORTS.put("h02", 5013);
        PORTS.put("jt600", 5014);
        PORTS.put("huabao", 5015);
        PORTS.put("v680", 5016);
        PORTS.put("pt502", 5017);
        PORTS.put("tr20", 5018);
        PORTS.put("navis", 5019);
        PORTS.put("meitrack", 5020);
        PORTS.put("skypatrol", 5021);
        PORTS.put("gt02", 5022);
        PORTS.put("gt06", 5023);
        PORTS.put("megastek", 5024);
        PORTS.put("navigil", 5025);
        PORTS.put("gpsgate", 5026);
        PORTS.put("teltonika", 5027);
        PORTS.put("mta6", 5028);
        PORTS.put("tzone", 5029);
        PORTS.put("tlt2h", 5030);
        PORTS.put("taip", 5031);
        PORTS.put("wondex", 5032);
        PORTS.put("cellocator", 5033);
        PORTS.put("galileo", 5034);
        PORTS.put("ywt", 5035);
        PORTS.put("tk102", 5036);
        PORTS.put("intellitrac", 5037);
        PORTS.put("gpsmta", 5038);
        PORTS.put("wialon", 5039);
        PORTS.put("carscop", 5040);
        PORTS.put("apel", 5041);
        PORTS.put("manpower", 5042);
        PORTS.put("globalsat", 5043);
        PORTS.put("atrack", 5044);
        PORTS.put("pt3000", 5045);
        PORTS.put("ruptela", 5046);
        PORTS.put("topflytech", 5047);
        PORTS.put("laipac", 5048);
        PORTS.put("aplicom", 5049);
        PORTS.put("gotop", 5050);
        PORTS.put("sanav", 5051);
        PORTS.put("gator", 5052);
        PORTS.put("noran", 5053);
        PORTS.put("m2m", 5054);
        PORTS.put("osmand", 5055);
        PORTS.put("easytrack", 5056);
        PORTS.put("gpsmarker", 5057);
        PORTS.put("khd", 5058);
        PORTS.put("piligrim", 5059);
        PORTS.put("stl060", 5060);
        PORTS.put("cartrack", 5061);
        PORTS.put("minifinder", 5062);
        PORTS.put("haicom", 5063);
        PORTS.put("eelink", 5064);
        PORTS.put("box", 5065);
        PORTS.put("freedom", 5066);
        PORTS.put("telic", 5067);
        PORTS.put("trackbox", 5068);
        PORTS.put("visiontek", 5069);
        PORTS.put("orion", 5070);
        PORTS.put("riti", 5071);
        PORTS.put("ulbotech", 5072);
        PORTS.put("tramigo", 5073);
        PORTS.put("tr900", 5074);
        PORTS.put("ardi01", 5075);
        PORTS.put("xt013", 5076);
        PORTS.put("autofon", 5077);
        PORTS.put("gosafe", 5078);
        PORTS.put("tt8850", 5079);
        PORTS.put("bce", 5080);
        PORTS.put("xirgo", 5081);
        PORTS.put("calamp", 5082);
        PORTS.put("mtx", 5083);
        PORTS.put("tytan", 5084);
        PORTS.put("avl301", 5085);
        PORTS.put("castel", 5086);
        PORTS.put("mxt", 5087);
        PORTS.put("cityeasy", 5088);
        PORTS.put("aquila", 5089);
        PORTS.put("flextrack", 5090);
        PORTS.put("blackkite", 5091);
        PORTS.put("adm", 5092);
        PORTS.put("watch", 5093);
        PORTS.put("t800x", 5094);
        PORTS.put("upro", 5095);
        PORTS.put("auro", 5096);
        PORTS.put("disha", 5097);
        PORTS.put("thinkrace", 5098);
        PORTS.put("pathaway", 5099);
        PORTS.put("arnavi", 5100);
        PORTS.put("nvs", 5101);
        PORTS.put("kenji", 5102);
        PORTS.put("astra", 5103);
        PORTS.put("homtecs", 5104);
        PORTS.put("fox", 5105);
        PORTS.put("gnx", 5106);
        PORTS.put("arknav", 5107);
        PORTS.put("supermate", 5108);
        PORTS.put("appello", 5109);
        PORTS.put("idpl", 5110);
        PORTS.put("huasheng", 5111);
        PORTS.put("l100", 5112);
        PORTS.put("granit", 5113);
        PORTS.put("carcell", 5114);
        PORTS.put("obddongle", 5115);
        PORTS.put("hunterpro", 5116);
        PORTS.put("raveon", 5117);
        PORTS.put("cradlepoint", 5118);
        PORTS.put("arknavx8", 5119);
        PORTS.put("autograde", 5120);
        PORTS.put("oigo", 5121);
        PORTS.put("jpkorjar", 5122);
        PORTS.put("cguard", 5123);
        PORTS.put("fifotrack", 5124);
        PORTS.put("smokey", 5125);
        PORTS.put("extremtrac", 5126);
        PORTS.put("trakmate", 5127);
        PORTS.put("at2000", 5128);
        PORTS.put("maestro", 5129);
        PORTS.put("ais", 5130);
        PORTS.put("gt30", 5131);
        PORTS.put("tmg", 5132);
        PORTS.put("pretrace", 5133);
        PORTS.put("pricol", 5134);
        PORTS.put("siwi", 5135);
        PORTS.put("starlink", 5136);
        PORTS.put("dmt", 5137);
        PORTS.put("xt2400", 5138);
        PORTS.put("dmthttp", 5139);
        PORTS.put("alematics", 5140);
        PORTS.put("gps056", 5141);
        PORTS.put("flexcomm", 5142);
        PORTS.put("vt200", 5143);
        PORTS.put("owntracks", 5144);
        PORTS.put("vtfms", 5145);
        PORTS.put("tlv", 5146);
        PORTS.put("esky", 5147);
        PORTS.put("genx", 5148);
        PORTS.put("flespi", 5149);
        PORTS.put("dway", 5150);
        PORTS.put("recoda", 5151);
        PORTS.put("oko", 5152);
        PORTS.put("ivt401", 5153);
        PORTS.put("sigfox", 5154);
        PORTS.put("t57", 5155);
        PORTS.put("spot", 5156);
        PORTS.put("m2c", 5157);
        PORTS.put("austinnb", 5158);
        PORTS.put("opengts", 5159);
        PORTS.put("cautela", 5160);
        PORTS.put("continental", 5161);
        PORTS.put("egts", 5162);
        PORTS.put("robotrack", 5163);
        PORTS.put("pt60", 5164);
        PORTS.put("telemax", 5165);
        PORTS.put("sabertek", 5166);
        PORTS.put("retranslator", 5167);
        PORTS.put("svias", 5168);
        PORTS.put("eseal", 5169);
        PORTS.put("freematics", 5170);
        PORTS.put("avema", 5171);
        PORTS.put("autotrack", 5172);
        PORTS.put("tek", 5173);
        PORTS.put("wristband", 5174);
        PORTS.put("milesmate", 5176);
        PORTS.put("anytrek", 5177);
        PORTS.put("smartsole", 5178);
        PORTS.put("its", 5179);
        PORTS.put("xrb28", 5180);
        PORTS.put("c2stek", 5181);
        PORTS.put("nyitech", 5182);
        PORTS.put("neos", 5183);
        PORTS.put("satsol", 5184);
        PORTS.put("globalstar", 5185);
        PORTS.put("sanul", 5186);
        PORTS.put("minifinder2", 5187);
        PORTS.put("radar", 5188);
        PORTS.put("techtlt", 5189);
        PORTS.put("starcom", 5190);
        PORTS.put("mictrack", 5191);
        PORTS.put("plugin", 5192);
        PORTS.put("leafspy", 5193);
        PORTS.put("naviset", 5194);
        PORTS.put("racedynamics", 5195);
        PORTS.put("rst", 5196);
        PORTS.put("pt215", 5197);
        PORTS.put("pacifictrack", 5198);
        PORTS.put("topin", 5199);
        PORTS.put("outsafe", 5200);
        PORTS.put("solarpowered", 5201);
        PORTS.put("motor", 5202);
        PORTS.put("omnicomm", 5203);
        PORTS.put("s168", 5204);
        PORTS.put("vnet", 5205);
        PORTS.put("blue", 5206);
        PORTS.put("pst", 5207);
        PORTS.put("dingtek", 5208);
        PORTS.put("wli", 5209);
        PORTS.put("niot", 5210);
        PORTS.put("portman", 5211);
        PORTS.put("moovbox", 5212);
        PORTS.put("futureway", 5213);
        PORTS.put("polte", 5214);
        PORTS.put("net", 5215);
        PORTS.put("mobilogix", 5216);
        PORTS.put("swiftech", 5217);
        PORTS.put("iotm", 5218);
        PORTS.put("dolphin", 5219);
        PORTS.put("ennfu", 5220);
        PORTS.put("navtelecom", 5221);
        PORTS.put("startek", 5222);
        PORTS.put("gs100", 5223);
        PORTS.put("mavlink2", 5224);
        PORTS.put("uux", 5225);
        PORTS.put("r12w", 5226);
        PORTS.put("flexiblereport", 5227);
        PORTS.put("thinkpower", 5228);
        PORTS.put("stb", 5229);
        PORTS.put("b2316", 5230);
        PORTS.put("hoopo", 5231);
        PORTS.put("dualcam", 5232);
        PORTS.put("xexun2", 5233);
        PORTS.put("techtocruz", 5234);
        PORTS.put("flexapi", 5235);
        PORTS.put("dsf22", 5236);
        PORTS.put("jido", 5237);
        PORTS.put("armoli", 5238);
        PORTS.put("teratrack", 5239);
        PORTS.put("envotech", 5240);
        PORTS.put("bstpl", 5241);
        PORTS.put("thuraya", 5242);
        PORTS.put("ndtpv6", 5243);
        PORTS.put("g1rus", 5244);
        PORTS.put("rftrack", 5245);
        PORTS.put("vlt", 5246);
        PORTS.put("transync", 5247);
        PORTS.put("t622iridium", 5248);
        PORTS.put("pui", 5249);
        PORTS.put("nto", 5250);
        PORTS.put("ramac", 5251);
        PORTS.put("positrex", 5252);
        PORTS.put("dragino", 5253);
        PORTS.put("fleetguide", 5254);
        PORTS.put("valtrack", 5255);
        PORTS.put("snapper", 5256);
        PORTS.put("gl601", 5257);
        PORTS.put("hyn600", 5258);
        PORTS.put("jmak", 5259);
        PORTS.put("bws", 5260);
    }

    PortConfigSuffix(String key, List<KeyType> types) {
        super(key, types, null);
    }

    @Override
    public ConfigKey<Integer> withPrefix(String protocol) {
        return new IntegerConfigKey(protocol + keySuffix, types, PORTS.get(protocol));
    }
}
