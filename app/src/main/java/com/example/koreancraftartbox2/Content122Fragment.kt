package com.example.koreancraftartbox2

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_content122.*


class Content122Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_content122, container, false)
        view.rootView.setOnTouchListener { _, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                CustomToast.cancelToast() // 터치 이벤트 발생 시 토스트를 취소합니다.
            }
            false
        }
        return view
    }

    private fun getInfo(index: Int): MutableMap<String, Any> {
        val myMap = mutableMapOf<String, Any>()
        if (index == 0) {
            myMap["subTitle"] = "木心漆器\n" +
                    "Wood-based Lacquerware"
            myMap["title"] = "나무(목심칠기)"
            myMap["manufacturer"] = "이선주"
            myMap["writer"] = "이선주, 신성필"
            myMap["company"] = "서울공예박물관"
            myMap["specification"] = "8.5×8.5×1.5"
            myMap["texture"] = "피나무에 정제칠"
            myMap["summary"] =
                "바탕을 나무로 만든 칠기"
            myMap["basic"] =
                "나무는 칠기의 가장 기본적인 바탕 재료이다. 옻칠을 하기 전 나무 바탕 상태\n를 '백골(白骨)'이라고도 한다. 나무에 칠을 한 것은 목심칠기, 목칠기, 목태\n칠기 등 다양하게 불린다. 나무는 온도와 습도에 민감하므로 뒤틀림을 방지하기 위해 칠기를 만들 때 나무 바탕 위 천을 바르는데, 이를 목심저피칠기(木心苧柀漆器)라 한다. 나무 바탕은 가공방법에 따라 판재가공형(板材加工形), 선반가공형(旋盤加工形), 회전접합형(回轉接合形), 일목가공형(一木加工形)으로 구분한다. 표본은 피나무를 6개월 간 건조한 후 판재 형태로 가공하고 칠을 하여 완성한 것이다."

            myMap["history"] =
                "목심칠기의 유물 사례는 초기철기시대부터 확인된다. 아산 남성리, 함평 초포리, 충주 호암동, 화순 대곡리의 적석목관묘에서 세형동검 검집에 옻칠한 것으로 보이는 시편이 발견되었다. 실물 자료로 완전한 형태의 칠기는 기원전 1세기 창원 다호리와 광주 신창동 유적에서 처음 발견되었다. 이후 삼국시대에서 조선시대, 근·현대기까지 목심칠기는 칠기의 기본 양식으로 제작되고 있다. 판재를 접합하여 가공한 함이나 가구 형태가 기본으로, 국립부여박물관 소장 <목제 굽다리바리>와 같이 회전 물레를 이용하여 형태를 가공한 것, 국립경주박물관 소장 <옻칠그릇>과 같이 얇은 판재를 몇 겹으로 돌려가며 붙인 것 등 다양한 나무 바탕 제작방식이 확인된다."

            myMap["science1"] = "광학현미경(투과광, 반사광, 편광), SEM-EDS"
            myMap["science2"] = "분석표본은 <목재-생칠-회칠(토회칠)-생칠-정제칠-정제칠> 순으로 제작되었다. 광학현미경으로 관찰해보면 목재 위 생칠이 목재조직 내부로 스며들어 있으며 그 위로 토분이 섞인 회칠, 생칠, 정제칠의 순으로 칠층이 형성된 것을 확인할 수 있다. SEM-EDS 분석 결과, 목재 바탕과 생칠, 정제칠은 주성분으로 탄소(C)와 산소(O)가 검출된다."
            myMap["reference"] = "이용희, 「우리나라 고대칠기의 칠기법 연구: 초기철기시대부터 통일신라시대까지 발굴 칠기유물을 중심으로」, 공주대학교 석사학위논문, 2010\n" +
                    "조훈상 외, 『한눈에 보는 옻칠』, 한국공예·디자인문화진흥원, 2017\n" +
                    "박영만 외, 『보존과 복원의 세계 나전칠기』, 국립중앙박물관, 2019\n" +
                    "이오희,  『천년기술 옻칠 문화재 보존』, 주류성, 2020"
        } else if (index == 1) {
            myMap["subTitle"] = "陶胎漆器\n" +
                    "Ceramics-based Lacquerware"
            myMap["title"] = "토기(도태칠기)"
            myMap["manufacturer"] = "이선주"
            myMap["writer"] = "이선주, 신성필"
            myMap["company"] = "서울공예박물관"
            myMap["specification"] = "8.5×8.5×1.5"
            myMap["texture"] = "토기에 정제칠"
            myMap["summary"] =
                "바탕을 토기나 도자기로 만든 칠기"
            myMap["basic"] =
                "옹기나 토기에 칠을 하여 만든 칠기를 도태칠기라 한다. 이와 유사한 것으로 기와용 점토로 만든 바탕에 칠을 한 와태칠기가 있다. 도태칠기는 유약을 바르지 않은 초벌 상태에서 옻칠을 칠해야 한다. 수축과 팽창을 반복하는 목재보다 유동성이 없다는 점에서 대량생산에 유리하나 파손의 가능성이 높다. 토기는 물이 스며드나 옻칠을 하면 방수 효과가 있어 액체를 담을 수 있다. 표본은 안동 가곡리에서 출토된 도태칠기를 모티프로 제작하였다."
            myMap["history"] =
                "도태칠기의 유물 사례는 고대부터 다수 확인된다. 대표적인 것이 안동 가곡리에서 출토된 도태칠기로 토기 표면에 부분적으로 옻칠 흔적을 볼 수 있다. 근대기 김진갑(金鎭甲) 작가가 청자 바탕에 옻칠을 입혀 현대적으로 응용한 도태칠기 작품을 제작하였다."
            myMap["science1"] = "광학현미경(투과광, 반사광, 편광), SEM-EDS"
            myMap["science2"] = "분석표본은 <토기-생칠-회칠(토회칠)-생칠-정제칠-정제칠> 순으로 제작되었다. 광학현미경으로 관찰해보면 토기 위 생칠과 토회칠 층은 바탕의 오목한 요철을 메우는 역할을 한다. 토회칠 위에는 생칠, 정제칠 순으로 칠층이 형성된 것을 확인할 수 있다. SEM-EDS 분석 결과, 바탕 재료인  토기 단면은 탄소(C)와 산소(O), Si(규소), Al(알루미늄), Fe(철), K(칼륨), Ti(티타늄)이 검출되고 토기의 광물 입자는 산소(O)와 Si(규소), 탄소(C) 성분이 검출되어 규산염광물임이 확인된다. 옻칠은 분석에서 탄소(C)와 산소(O)가 주성분으로 검출된다."
            myMap["reference"] = "이용희, 「우리나라 고대칠기의 칠기법 연구: 초기철기시대부터 통일신라시대까지 발굴 칠기유물을 중심으로」, 공주대학교 석사학위논문, 2010\n" +
                    "조훈상 외, 『한눈에 보는 옻칠』, 한국공예·디자인문화진흥원, 2017\n" +
                    "박영만 외, 『보존과 복원의 세계 나전칠기』, 국립중앙박물관, 2019\n" +
                    "이오희,  『천년기술 옻칠 문화재 보존』, 주류성, 2020"
        } else if (index == 2) {
            myMap["subTitle"] = "金胎漆器\n" +
                    "Metal-based  Lacquerware"
            myMap["title"] = "금속(금태칠기)"
            myMap["manufacturer"] = "이선주"
            myMap["writer"] = "이선주, 신성필"
            myMap["company"] = "서울공예박물관"
            myMap["specification"] = "8.5×8.5×1.5"
            myMap["texture"] = "황동에 정제칠"
            myMap["summary"] =
                "바탕을 금속으로 만든 칠기"
            myMap["basic"] =
                "금속에 칠을 하여 만든 칠기를 금태칠기라 한다. 주로 금속의 부식을 방지하는 목적에서 옻칠을 칠했다. 바탕 금속으로는 철, 동, 황동, 주석, 알루미늄 등이 사용된다. 금속은 목재와 달리 열을 가하여 바탕과 옻칠을 흡착시킨다.  120~170℃의 온도에서 굽고 다시 칠장에 넣어 완성한다. 표본은 낙랑에서 만든 옻칠한 금속 갑옷을 모티프로 제작하였다."
            myMap["history"] =
                "금태칠기의 유물 사례는 고대부터 다수 확인된다. 대표적인 것이 낙랑에서 제작된 철 갑옷 조각에 옻칠이 발견된 사례이다. 갑옷의 원형을 알 수 없지만 한반도에서 금태칠기가 발견되는 이른 사례로서 중요한 단서이다. 이후 조선시대 갑옷에도 옻칠한 사례가 적지 않게 발견된다."
            myMap["science1"] = "광학현미경(투과광, 반사광, 편광), SEM-EDS"
            myMap["science2"] = "분석표본은 <금속(황동)-생칠-정제칠-정제칠-정제칠> 순으로 제작되었다. 광학현미경으로 관찰해보면 금속 위 생칠이 부분적으로 확인된다. 생칠 위 세 번 바른 정제칠 중 아래 두 층은 거의 하나로 보이며 맨 윗층은 색상에 차이가 있어 층이 구분된다. SEM-EDS 분석 결과,  바탕 재료인 금속은 산소(O), 탄소(C) 함께 Cu(구리)와 Zn(아연)이 검출되어 구리에 아연을 첨가하여 만든 황동임이 확인된다. 옻칠은 분석에서 탄소(C)와 산소(O)가 주성분으로 검출된다."
            myMap["reference"] = "이용희, 「우리나라 고대칠기의 칠기법 연구: 초기철기시대부터 통일신라시대까지 발굴 칠기유물을 중심으로」, 공주대학교 석사학위논문, 2010\n" +
                    "조훈상 외, 『한눈에 보는 옻칠』, 한국공예·디자인문화진흥원, 2017\n" +
                    "박영만 외, 『보존과 복원의 세계 나전칠기』, 국립중앙박물관, 2019\n" +
                    "이오희,  『천년기술 옻칠 문화재 보존』, 주류성, 2020"
        } else if (index == 3) {
            myMap["subTitle"] = "藍胎漆器\n" +
                    "Bamboo-based lacquerware"
            myMap["title"] = "대나무(남태칠기)"
            myMap["manufacturer"] = "이선주"
            myMap["writer"] = "이선주, 신성필"
            myMap["company"] = "서울공예박물관"
            myMap["specification"] = "8.5×8.5×1.5"
            myMap["texture"] = "대나무에 정제칠"
            myMap["summary"] =
                "바탕을 대나무를 엮어 만든 칠기"
            myMap["basic"] =
                "대나무에 칠을 하여 만든 칠기를 남태칠기라 한다. 대나무로 만든 바탕은 대나무를 잘게 쪼개어 엮어 만든 것과 대나무를 원통형으로 잘라 필통, 화병 등으로 형태를 활용한 것의 두 종류가 있다. 표본은 국립중앙박물관 소장 <죽장함>을 모티프로 제작하였다."
            myMap["history"] =
                "남태칠기 유물의 이른 사례로는 평안남도 대동군 남천면에 있는 채협총(彩篋塚)에서 출토된 <채화칠협(彩畫漆篋)>이 대표적이다. 얇은 대나무를 엮어 상자 형태의 바탕을 만들었으며, 상자 모서리와 윗부분에 옻칠로 그림을 그렸다. 조선시대에는 대나무 원통형으로 자른 바탕에 문양을 조각하고 옻칠한 필통이 다수 확인된다."
            myMap["science1"] = "광학현미경(투과광, 반사광, 편광), SEM-EDS"
            myMap["science2"] = "분석표본은 <대나무-생칠-정제칠-정제칠-정제칠> 순으로 제작되었다. 광학현미경으로 관찰해보면 바탕인 대나무 횡단면의 유관 속과 유세포, 칠층이 확인된다. 바탕 위 생칠이 대나무 속에 스며들어 공간을 채우고 있다. 생칠 위 정제칠은 다양한 두께를 띄며 가장 윗층은 다른 두 개의 층보다 옅은 색을 띤다. SEM-EDS 분석 결과, 생칠로 채워진 대나무 속 부분은 탄소(C)가 높은 함량으로 검출되며 옻칠층은 탄소(C)와 산소(O)가 주성분이다."
            myMap["reference"] = "이용희, 「우리나라 고대칠기의 칠기법 연구: 초기철기시대부터 통일신라시대까지 발굴 칠기유물을 중심으로」, 공주대학교 석사학위논문, 2010\n" +
                    "조훈상 외, 『한눈에 보는 옻칠』, 한국공예·디자인문화진흥원, 2017\n" +
                    "박영만 외, 『보존과 복원의 세계 나전칠기』, 국립중앙박물관, 2019\n" +
                    "이오희,  『천년기술 옻칠 문화재 보존』, 주류성, 2020"
        } else if (index == 4) {
            myMap["subTitle"] = "皮胎漆器\n" +
                    "Leather-based  Lacquerware"
            myMap["title"] = "가죽(피태칠기)"
            myMap["manufacturer"] = "이선주"
            myMap["writer"] = "이선주, 신성필"
            myMap["company"] = "서울공예박물관"
            myMap["specification"] = "8.5×8.5×1.5"
            myMap["texture"] = "소가죽에 정제칠"
            myMap["summary"] =
                "바탕을 가죽으로 만든 칠기"
            myMap["basic"] =
                "가죽 바탕에 칠을 하여 만든 칠기를 피태칠기라 한다. 습기와 병충해에 약한 가죽의 단점을 옻칠로 보완한 것이다. 표본은 피태칠기 유물의 출토 사례를 모티프로 소가죽에 옻칠하여 제작하였다."
            myMap["history"] =
                "후자는 한국에 사례가 다수 남아있다. 소가죽과 어피가 사용되었는데, 특히 어피는 보록(寶錄), 함(函), 말 안장, 안경집 등 다양하게 활용되었다. 철갑상어나 가오리 가죽에 칠을 하면 돌기 문양이 돋보이는데 이를 장식요소로 활용한 것이다. 어피를 물에 담가 부드럽게 만들고 나무 백골에 붙여 고정한다. 어피가 완전히 건조되면 옻칠하여 마무리한다."
            myMap["science1"] = "광학현미경(투과광, 반사광, 편광), SEM-EDS"
            myMap["science2"] = "분석표본은 <소가죽-생칠-정제칠-정체칠> 순으로 제작되었다. 광학현미경으로 관찰해보면 바탕 위 생칠이 가죽 속으로 스며들어 황색을 띠는 것이 확인된다. 생칠과 정제칠 사이는 경계가 뚜렷하지 않으나 정제칠이 좀 더 붉은색을 띠어 구분된다. 가장 위의 정제칠층이 다른 바탕 소재보다 어두운 색을 띄는 것이 특징적이다. SEM-EDS 분석 결과, 가죽은 주성분인 탄소(C), 산소(O)와 함께 미량의 Al(알루미늄), Si(규소), S(황), Cl(염소), Ti(티타늄)이 검출된다. 가죽의 내측에서는 C(탄소)가 주성분으로 높게 측정되나 표면에서는 Ti(티타늄)의 함량이 15.64 wt% 까지 검출되었다."
            myMap["reference"] = "이용희, 「우리나라 고대칠기의 칠기법 연구: 초기철기시대부터 통일신라시대까지 발굴 칠기유물을 중심으로」, 공주대학교 석사학위논문, 2010\n" +
                    "조훈상 외, 『한눈에 보는 옻칠』, 한국공예·디자인문화진흥원, 2017\n" +
                    "박영만 외, 『보존과 복원의 세계 나전칠기』, 국립중앙박물관, 2019\n" +
                    "이오희,  『천년기술 옻칠 문화재 보존』, 주류성, 2020"
        }else if (index == 5) {
            myMap["subTitle"] = "紙胎漆器\n" +
                    "Paper-based Lacquerware"
            myMap["title"] = "종이(지승,지태칠기)"
            myMap["manufacturer"] = "이선주"
            myMap["writer"] = "이선주, 신성필"
            myMap["company"] = "서울공예박물관"
            myMap["specification"] = "8.5×8.5×1.5"
            myMap["texture"] = "종이에 정제칠"
            myMap["summary"] =
                "바탕을 종이로 만든 칠기"
            myMap["basic"] =
                "종이 바탕에 칠을 하여 만든 칠기를 지태칠기라 한다. 옻칠이 방수 기능을 부여하여 물에 약한 한지의 단점을 보완해주는 것이다. 표본은 종이를 길게 찢어 꼬아 만든 끈(지승)을 엮어서 옻칠하여 제작하였다."
            myMap["history"] =
                "종이로 칠기 바탕을 만드는 방법에는 세 가지가 있다. 첫 번째는 종이를 물에 풀어 풀과 섞어 반죽하여 형태를 만드는 것이다. 두 번째는 종이를 겹쳐 붙여 형태를 단단하게 만들고 그 위에 칠을 하는 것이다. 마지막으로 세 번째로는 한지를 길게 찢어 이를 꼬아 엮어서 기물을 만드는데, 이를 '지승(紙繩)'이라 한다. 반짇고리나 쟁반, 안경집, 표주박, 소반, 바구니 등과 같이 주로 여성들이 사용하는 기물에서 사례를 볼 수 있다. 특히 지승 요강은 가볍고 소리가 나지 않기 때문에 옛날에 시집가는 신부의 가마에 넣어주었다고 한다. 천연 염색한 종이를 이용하거나 주칠을 칠하여 색을 넣기도 한다."
            myMap["science1"] = "광학현미경(투과광, 반사광, 편광), SEM-EDS"
            myMap["science2"] = "분석표본은 <종이-생칠-생칠-정제칠> 순으로 제작되었다. 광학현미경으로 관찰해보면 바탕 위 생칠이 종이 속으로 흡수되었지만 중심부까지 완전히 스며들지 못한 모습이 관찰된다. SEM-EDS 분석 결과, 한지를 비벼 꼬아 좁고 긴 노끈 형태로 만든 후 다시 엮어 만든 지승칠기의 꼬임 형태가 확인된다. 유기물의 특성상 탄소(C)가 주성분으로 매우 높고 미량의 산소(O), Si(규소), Ca(칼슘)이 함께 검출되었다."
            myMap["reference"] = "이용희, 「우리나라 고대칠기의 칠기법 연구: 초기철기시대부터 통일신라시대까지 발굴 칠기유물을 중심으로」, 공주대학교 석사학위논문, 2010\n" +
                    "조훈상 외, 『한눈에 보는 옻칠』, 한국공예·디자인문화진흥원, 2017\n" +
                    "박영만 외, 『보존과 복원의 세계 나전칠기』, 국립중앙박물관, 2019\n" +
                    "이오희,  『천년기술 옻칠 문화재 보존』, 주류성, 2020"
        } else if (index == 6) {
            myMap["subTitle"] = "夾紵漆器 · Dry Lacquer"
            myMap["title"] = "협저"
            myMap["manufacturer"] = "이선주"
            myMap["writer"] = "이선주, 신성필"
            myMap["company"] = "서울공예박물관"
            myMap["specification"] = "7.4×0.8"
            myMap["texture"] = "소창에 흑칠"
            myMap["summary"] =
                "천을 겹겹이 붙여 만드는 칠기"
            myMap["basic"] =
                "천을 겹겹이 붙여 만든 형태에 칠을 하여 만든 칠기를 '협저' 또는 일본식 용어인 '건칠(乾漆)'이라고 한다. 무게가 가볍고 형태의 제약이 없어 현대 공예가들이 많이 활용한다. 흙, 볏짚 등 쉽게 제거할 수 있는 소재로 틀을 만들고 그 위에 옻칠과 밀풀을 섞은 칠풀과 천을 번갈아가며 바르고 건조한다. 천이 겹겹이 쌓여 형태가 유지될 수 있는 3~5mm의 두께가 되면 틀과 천을 분리하고 여기에 옻칠을 여러 번 발라 마무리한다. 표본은 강창규의 <건칠반>을 모티브로 팔각의 접시 형태로 제작하였다. 협저틀 만들기, 베 바르기, 회 바르기, 완성까지 협저칠기 제작과정의 대표적인 네 단계의 과정으로 구성하였다."
            myMap["history"] =
                "협저 기법을 사용한 유물 사례는 주로 고려시대 불상에서 확인된다. 천을 겹겹이 쌓아 불상 바탕을 만들고 그 위에 옻칠하고 금박과 금분을 입혀 완성한 것이다. 협저 유물의 가장 이른 사례는 낙랑 유적에서 출토된 칠기 그릇으로, 나무 바탕 없이 천으로만 제작되었음이 확인되었다. 근대에 강창규(姜昌奎) 작가가 일본에서 유학하면서 건칠 기법을 배워 현대적으로 응용한 작품을 제작하였다."
            myMap["science1"] = "광학현미경(투과광, 반사광, 편광), SEM-EDS"
            myMap["science2"] = "분석표본은 <협저틀(목재)-생칠-(삼베-칠풀)×8회-탄회칠(목탄분)-정제칠> 순으로 제작되었다. 광학현미경으로 관찰해보면 협저틀은 제작 과정에서 제거하여 보이지 않으며 8겹의 삼베층이 칠풀로 배접되어 있다. 그 위에 회칠을 하여 삼베의 요철을 메웠다. 회칠층 위의 정제칠은 상당 부분 회칠에 스며들어 두께가 매우 얇다. SEM-EDS 분석 결과, 8겹의 직물 조직과 회칠 속 목탄분이 확인된다. 바탕인 삼베와 접착제인 칠풀의 성분을 분석한 결과  탄소(C)와 산소(O)만이 주성분으로 검출되었다."
            myMap["reference"] = "이용희, 「우리나라 고대칠기의 칠기법 연구: 초기철기시대부터 통일신라시대까지 발굴 칠기유물을 중심으로」, 공주대학교 석사학위논문, 2010\n" +
                    "조훈상 외, 『한눈에 보는 옻칠』, 한국공예·디자인문화진흥원, 2017\n" +
                    "박영만 외, 『보존과 복원의 세계 나전칠기』, 국립중앙박물관, 2019\n" +
                    "이오희,  『천년기술 옻칠 문화재 보존』, 주류성, 2020"
        }
        return myMap
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        leftButton.setOnClickListener { replaceWithSecondFragment()
            CustomToast.cancelToast() }

        val contentArray = arrayOf(content1, content2, content3, content4, content5, content6, content7)

        contentArray.forEachIndexed { index, content ->
            content.setOnClickListener {
                val intent = Intent(requireActivity(), ContentDetailActivity1::class.java)

                val uriBuilder = Uri.Builder()
                val myMap = getInfo(index)
                for ((key, value) in myMap) {
                    val stringValue = value.toString()
                    uriBuilder.appendQueryParameter(key, stringValue)
                }
                val uri = uriBuilder.build()
                intent.data = uri
                intent.putExtra("index", index)

                val handler = Handler(Looper.getMainLooper())
                val delayMillis: Long = 300
                handler.postDelayed({
                    startActivity(intent)
                }, delayMillis)
            }
        }
    }


    private fun replaceWithSecondFragment() {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.detail_content_frame1, Content121Fragment())
            .addToBackStack(null)
            .commit()
    }
}