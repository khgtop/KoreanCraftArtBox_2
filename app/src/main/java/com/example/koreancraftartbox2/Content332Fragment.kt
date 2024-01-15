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
import kotlinx.android.synthetic.main.fragment_content332.*


class Content332Fragment : Fragment()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_content332, container, false)
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
            myMap["subTitle"] = "貝 · Northern Disk abalone shell"
            myMap["title"] = "색패"
            myMap["manufacturer"] = "평화자개"
            myMap["writer"] = "이선주"
            myMap["company"] = "-"
            myMap["specification"] = "7.2×10.6×2.9"
            myMap["texture"] = "전복류"
            myMap["summary"] =
                "한국 나전칠기의 가장 기본 재료로 한반도가 주산지인 전복패의 일종"
            myMap["basic1"] =
                "한국 나전칠기의 가장 기본 재료로 주로 줄음질과 끊음질용으로 사용한다. 색패의 주산지는 한국으로 한반도 동해, 남해, 서해에서 모두 서식한다. 한국 나전칠기의 가장 기본 재료로 푸른빛과 붉은빛이 강한 영롱한 색을 낸다. 동해에서 나는 색패는 색이 아름답지만 바닥면이 고르지 못해 가공이 어렵다. 서해안의 경우 바닥이 편편하지만 색이 좋지 않다. 남해안에서 나는 것은 색이 선명\n하고 바닥이 고른 편이다."

            myMap["basic2"] =
                "칠기에 사용되는 조개껍데기는 전복류, 소라류, 진주패류가 있다. 한국에서는 주로 전복류를 사용하며 남해에서 나는 것이 공예 재료로 유명하다. 껍데기에 5개의 구멍이 있어 오공나(五孔螺)라고도 부른다. 전복은 전 세계적으로 90종류에 달하며, 우리나라에서는 전복, 말전복, 오분자기, 둥근전복 등이 서식한다. 전복의 구멍 아래 바닥 면은 안쪽부터 중장, 앞장이라 한다. 앞장은 너비가 넓어 줄음질용으로 사용한다. 전복 구멍 위의 안쪽 좁은 부분은 칼패라 하고 그 위의 돌출된 좁은 부분을 귀패라고 한다. 칼패와 귀패는 끊음질용으로 사용한다. 조선시대 이전까지 주로 색패가 사용되었으며, 일제강점기 이후 외국산 전복류가 혼용되었다."

            myMap["reference"] = "국립문화재연구소, 『(중요무형문화재 제10호)나전장』, 민속원, 2006\n" +
                    "권상오, 『나전공예』, 대원사, 2007\n" +
                    "김윤경, 『한눈에 보는 나전칠기』, 한국공예디자인문화진흥원, 2011"
        } else if (index == 1) {
            myMap["subTitle"] = "貝 · Disk abalone shell"
            myMap["title"] = "청패"
            myMap["manufacturer"] = "평화자개"
            myMap["writer"] = "이선주"
            myMap["company"] = "-"
            myMap["specification"] = "15.6×12.3×4.2"
            myMap["texture"] = "전복류"
            myMap["summary"] =
                "한반도 남해 연안과 일본이 주산지인 전복패의 일종"
            myMap["basic1"] =
                "청패는 한반도 남해 연안과 제주도, 일본을 주산지로 한다. 색패보다 무늬가 화려하지 않지만 청빛과 푸른빛이 은은하게 섞여 영롱한 느낌을 준다. 암수의 모양이 달라 구별되는데 암컷이 바닥이 평평하고 두꺼워 줄음질에 사용하기 좋다."

            myMap["basic2"] =
                "칠기에 사용되는 조개껍데기는 전복류, 소라류, 진주패류가 있다. 한국에서는 주로 전복류를 사용하며 남해에서 나는 것이 공예 재료로 유명하다. 껍데기에 5개의 구멍이 있어 오공나(五孔螺)라고도 부른다. 전복은 전 세계적으로 90종류에 달하며, 우리나라에서는 전복, 말전복, 오분자기, 둥근전복 등이 서식한다. 전복의 구멍 아래 바닥 면은 안쪽부터 중장, 앞장이라 한다. 앞장은 너비가 넓어 줄음질용으로 사용한다. 전복 구멍 위의 안쪽 좁은 부분은 칼패라 하고 그 위의 돌출된 좁은 부분을 귀패라고 한다. 칼패와 귀패는 끊음질용으로 사용한다. 조선시대 이전까지 주로 색패가 사용되었으며, 일제강점기 이후 외국산 전복류가 혼용되었다."

            myMap["reference"] = "국립문화재연구소, 『(중요무형문화재 제10호)나전장』, 민속원, 2006\n" +
                    "권상오, 『나전공예』, 대원사, 2007\n" +
                    "김윤경, 『한눈에 보는 나전칠기』, 한국공예디자인문화진흥원, 2011"
        } else if (index == 2) {
            myMap["subTitle"] = "貝 · Paua (Rainbow abalone) shell"
            myMap["title"] = "뉴질랜드패"
            myMap["manufacturer"] = "평화자개"
            myMap["writer"] = "이선주"
            myMap["company"] = "-"
            myMap["specification"] = "15.5×11.6×4.9"
            myMap["texture"] = "전복류"
            myMap["summary"] =
                "뉴질랜드 남쪽 섬이 주산지인 전복패의 일종"
            myMap["basic1"] =
                "뉴질랜드패는 뉴질랜드 남쪽 섬에 서식하는 전복이다. 멕시코패와 비슷하나 청색, 진보라, 황금색, 핑크색 등 색상이 다양하다. 껍데기의 바깥쪽을 관찰해보면 침식 흔적이 많아 대체로 자개의 질이 좋지 않다. 줄음질과 끊음질에 주로 사용된다."

            myMap["basic2"] =
                "칠기에 사용되는 조개껍데기는 전복류, 소라류, 진주패류가 있다. 한국에서는 주로 전복류를 사용하며 남해에서 나는 것이 공예 재료로 유명하다. 껍데기에 5개의 구멍이 있어 오공나(五孔螺)라고도 부른다. 전복은 전 세계적으로 90종류에 달하며, 우리나라에서는 전복, 말전복, 오분자기, 둥근전복 등이 서식한다. 전복의 구멍 아래 바닥 면은 안쪽부터 중장, 앞장이라 한다. 앞장은 너비가 넓어 줄음질용으로 사용한다. 전복 구멍 위의 안쪽 좁은 부분은 칼패라 하고 그 위의 돌출된 좁은 부분을 귀패라고 한다. 칼패와 귀패는 끊음질용으로 사용한다. 조선시대 이전까지 주로 색패가 사용되었으며, 일제강점기 이후 외국산 전복류가 혼용되었다."

            myMap["reference"] = "국립문화재연구소, 『(중요무형문화재 제10호)나전장』, 민속원, 2006\n" +
                    "권상오, 『나전공예』, 대원사, 2007\n" +
                    "김윤경, 『한눈에 보는 나전칠기』, 한국공예디자인문화진흥원, 2011"
        } else if (index == 3) {
            myMap["subTitle"] = "貝 · Green abalone shell"
            myMap["title"] = "멕시코패"
            myMap["manufacturer"] = "평화자개"
            myMap["writer"] = "이선주"
            myMap["company"] = "-"
            myMap["specification"] = "15.7×11.8×4.5"
            myMap["texture"] = "전복류"
            myMap["summary"] =
                "멕시코 북서쪽 반도가 주산지인 전복패의 일종"
            myMap["basic1"] =
                "멕시코 북서쪽 바하칼리포르니아 반도가 주산지이다. 공작새의 깃털과 같이 푸르고 영롱한 색과 물결무늬가 특징으로 공작패라고도 한다. 일부분이 청록색이고 나머지 부분이 흰색을 띠는 것은 얼룩이패라 한다. 껍데기 안쪽 청색의 두꺼운 부분은 '옥패'라 하여 자개 상감과 조각에 사용한다."

            myMap["basic2"] =
                "칠기에 사용되는 조개껍데기는 전복류, 소라류, 진주패류가 있다. 한국에서는 주로 전복류를 사용하며 남해에서 나는 것이 공예 재료로 유명하다. 껍데기에 5개의 구멍이 있어 오공나(五孔螺)라고도 부른다. 전복은 전 세계적으로 90종류에 달하며, 우리나라에서는 전복, 말전복, 오분자기, 둥근전복 등이 서식한다. 전복의 구멍 아래 바닥 면은 안쪽부터 중장, 앞장이라 한다. 앞장은 너비가 넓어 줄음질용으로 사용한다. 전복 구멍 위의 안쪽 좁은 부분은 칼패라 하고 그 위의 돌출된 좁은 부분을 귀패라고 한다. 칼패와 귀패는 끊음질용으로 사용한다. 조선시대 이전까지 주로 색패가 사용되었으며, 일제강점기 이후 외국산 전복류가 혼용되었다."

            myMap["reference"] = "국립문화재연구소, 『(중요무형문화재 제10호)나전장』, 민속원, 2006\n" +
                    "권상오, 『나전공예』, 대원사, 2007\n" +
                    "김윤경, 『한눈에 보는 나전칠기』, 한국공예디자인문화진흥원, 2011"
        } else if (index == 4) {
            myMap["subTitle"] = "貝 · Smooth Australia abalone shell"
            myMap["title"] = "호주패"
            myMap["manufacturer"] = "평화자개"
            myMap["writer"] = "이선주"
            myMap["company"] = "-"
            myMap["specification"] = "14.3×10.8×4.2"
            myMap["texture"] = "전복류"
            myMap["summary"] =
                "호주가 주산지인 전복패의 일종"
            myMap["basic1"] =
                "호주가 주산지이고 서식지에 따라 모양, 색, 크기가 조금씩 다르다. 흰색 바탕에 붉은색이 감도는 것이 특징이다. 크기에 비해 무게가 가볍고, 바닥면이 비교적 고른 편이어서 넓은 면적의 자개를 얻기 용이하다. 줄음질용으로 사용한다."

            myMap["basic2"] =
                "칠기에 사용되는 조개껍데기는 전복류, 소라류, 진주패류가 있다. 한국에서는 주로 전복류를 사용하며 남해에서 나는 것이 공예 재료로 유명하다. 껍데기에 5개의 구멍이 있어 오공나(五孔螺)라고도 부른다. 전복은 전 세계적으로 90종류에 달하며, 우리나라에서는 전복, 말전복, 오분자기, 둥근전복 등이 서식한다. 전복의 구멍 아래 바닥 면은 안쪽부터 중장, 앞장이라 한다. 앞장은 너비가 넓어 줄음질용으로 사용한다. 전복 구멍 위의 안쪽 좁은 부분은 칼패라 하고 그 위의 돌출된 좁은 부분을 귀패라고 한다. 칼패와 귀패는 끊음질용으로 사용한다. 조선시대 이전까지 주로 색패가 사용되었으며, 일제강점기 이후 외국산 전복류가 혼용되었다."

            myMap["reference"] = "국립문화재연구소, 『(중요무형문화재 제10호)나전장』, 민속원, 2006\n" +
                    "권상오, 『나전공예』, 대원사, 2007\n" +
                    "김윤경, 『한눈에 보는 나전칠기』, 한국공예디자인문화진흥원, 2011"
        } else if (index == 5) {
            myMap["subTitle"] = "貝 · Pink abalone shell"
            myMap["title"] = "핑크패"
            myMap["manufacturer"] = "평화자개"
            myMap["writer"] = "이선주"
            myMap["company"] = "-"
            myMap["specification"] = "14.8×12.8×5.6"
            myMap["texture"] = "전복류"
            myMap["summary"] =
                "미국 캘리포니아주 남부가 주산지인 전복패의 일종"
            myMap["basic1"] =
                "미국 서부에서 멕시코로 이어지는 캘리포니아주 남부가 주산지이다. 전복 중에서 크기가 제일 크며 붉은색, 분홍색, 청색의 얼룩무늬가 깊은 빛깔을 낸다. 껍데기가 붉어 홍패라고도 불린다."
            myMap["basic2"] =
                "칠기에 사용되는 조개껍데기는 전복류, 소라류, 진주패류가 있다. 한국에서는 주로 전복류를 사용하며 남해에서 나는 것이 공예 재료로 유명하다. 껍데기에 5개의 구멍이 있어 오공나(五孔螺)라고도 부른다. 전복은 전 세계적으로 90종류에 달하며, 우리나라에서는 전복, 말전복, 오분자기, 둥근전복 등이 서식한다. 전복의 구멍 아래 바닥 면은 안쪽부터 중장, 앞장이라 한다. 앞장은 너비가 넓어 줄음질용으로 사용한다. 전복 구멍 위의 안쪽 좁은 부분은 칼패라 하고 그 위의 돌출된 좁은 부분을 귀패라고 한다. 칼패와 귀패는 끊음질용으로 사용한다. 조선시대 이전까지 주로 색패가 사용되었으며, 일제강점기 이후 외국산 전복류가 혼용되었다."
            myMap["reference"] = "국립문화재연구소, 『(중요무형문화재 제10호)나전장』, 민속원, 2006\n" +
                    "권상오, 『나전공예』, 대원사, 2007\n" +
                    "김윤경, 『한눈에 보는 나전칠기』, 한국공예디자인문화진흥원, 2011"
        } else if (index == 6) {
            myMap["subTitle"] = "貝 · Black abalone shell"
            myMap["title"] = "대만패"
            myMap["manufacturer"] = "평화자개"
            myMap["writer"] = "이선주"
            myMap["company"] = "-"
            myMap["specification"] = "11.8×9.0×3.5"
            myMap["texture"] = "전복류"
            myMap["summary"] =
                "멕시코 북서 해안이 주산지인 전복패의 일종"
            myMap["basic1"] =
                "미국과 멕시코 북서 해안이 주산지로 껍데기가 검은색을 띤다. 자개는 분홍빛이 강하고 선명하며 전체적으로 빛깔이 좋다. 패가 단단하여 잘 부서지므로 끊음질에는 적합하지 않아 줄음질용으로 사용한다."
            myMap["basic2"] =
                "칠기에 사용되는 조개껍데기는 전복류, 소라류, 진주패류가 있다. 한국에서는 주로 전복류를 사용하며 남해에서 나는 것이 공예 재료로 유명하다. 껍데기에 5개의 구멍이 있어 오공나(五孔螺)라고도 부른다. 전복은 전 세계적으로 90종류에 달하며, 우리나라에서는 전복, 말전복, 오분자기, 둥근전복 등이 서식한다. 전복의 구멍 아래 바닥 면은 안쪽부터 중장, 앞장이라 한다. 앞장은 너비가 넓어 줄음질용으로 사용한다. 전복 구멍 위의 안쪽 좁은 부분은 칼패라 하고 그 위의 돌출된 좁은 부분을 귀패라고 한다. 칼패와 귀패는 끊음질용으로 사용한다. 조선시대 이전까지 주로 색패가 사용되었으며, 일제강점기 이후 외국산 전복류가 혼용되었다."
            myMap["reference"] = "국립문화재연구소, 『(중요무형문화재 제10호)나전장』, 민속원, 2006\n" +
                    "권상오, 『나전공예』, 대원사, 2007\n" +
                    "김윤경, 『한눈에 보는 나전칠기』, 한국공예디자인문화진흥원, 2011"
        } else if (index == 7) {
            myMap["subTitle"] = "貝 · Great Green turban shell"
            myMap["title"] = "야광패"
            myMap["manufacturer"] = "평화자개"
            myMap["writer"] = "이선주"
            myMap["company"] = "-"
            myMap["specification"] = "17.0×14.2×8.8"
            myMap["texture"] = "소라류"
            myMap["summary"] =
                "일본 남쪽, 인도네시아, 미얀마, 필리핀이 주산지인 소라패의 일종\n"
            myMap["basic1"] =
                "일본 남쪽, 인도네시아, 미얀마, 필리핀이 주산지로 산지에 따라 색상의 차이가 크다. 자개 안쪽은 우윷빛이 나며 겉은 푸른색과 붉은빛이 돌아 화려하다. 특히 미얀마에서 생산되는 야광패는 푸른색과 붉은색이 교차하면서 신비한 느낌을 주어 가장 선호된다. 주로 줄음질용으로 사용한다."
            myMap["basic2"] =
                "칠기에 사용되는 소라류로 야광패, 수도리패, 뿔소라패가 있다. 특유의 나선 형태로 인해 악기나 술잔으로도 사용된 소라류는 예로부터 중국, 일본에서 자개 재료로 사용되었다. 소라류의 껍데기 안쪽은 회백색으로 진주빛이 강하고 은은한 색을 띤다. 전복패와 달리 소라패는 나선을 따라 길게 잘라서 가공하기 때문에 길이가 긴 자개를 얻을 수 있다. 나무와 같이 얇고 긴 문양을 표현할 때 적합하다. 가공 부위에 따라 앞장, 중장, 귀패로 나뉘며 길이가 가장 길고 색상이 좋은 앞장이 선호된다. 줄음질과 끊음질용으로 사용되며 두께가 두꺼워 단추로 제작되기도 한다."
            myMap["reference"] = "국립문화재연구소, 『(중요무형문화재 제10호)나전장』, 민속원, 2006\n" +
                    "권상오, 『나전공예』, 대원사, 2007\n" +
                    "김윤경, 『한눈에 보는 나전칠기』, 한국공예디자인문화진흥원, 2011"
        } else if (index == 8) {
            myMap["subTitle"] = "貝 · Commercial trochus shell"
            myMap["title"] = "수도리패"
            myMap["manufacturer"] = "평화자개"
            myMap["writer"] = "이선주"
            myMap["company"] = "-"
            myMap["specification"] = "9.8×8.7×7.3"
            myMap["texture"] = "소라류"
            myMap["summary"] =
                "인도, 필리핀, 인도네시아, 괌이 주산지인 소라패의 일종"
            myMap["basic1"] =
                "인도, 필리핀, 인도네시아, 괌이 주산지로 고둥으로 많이 부른다. 야광패 대용으로 줄음질에 사용하며 흰색 바탕에 무지개색이 연하게 나타나 바탕이 깨끗한 문양을 표현하는데 쓰인다. 껍데기 모양에 따라 볼록, 반볼록, 평면형으로 구분한다."
            myMap["basic2"] =
                "칠기에 사용되는 소라류로 야광패, 수도리패, 뿔소라패가 있다. 특유의 나선 형태로 인해 악기나 술잔으로도 사용된 소라류는 예로부터 중국, 일본에서 자개 재료로 사용되었다. 소라류의 껍데기 안쪽은 회백색으로 진주빛이 강하고 은은한 색을 띤다. 전복패와 달리 소라패는 나선을 따라 길게 잘라서 가공하기 때문에 길이가 긴 자개를 얻을 수 있다. 나무와 같이 얇고 긴 문양을 표현할 때 적합하다. 가공 부위에 따라 앞장, 중장, 귀패로 나뉘며 길이가 가장 길고 색상이 좋은 앞장이 선호된다. 줄음질과 끊음질용으로 사용되며 두께가 두꺼워 단추로 제작되기도 한다."
            myMap["reference"] = "국립문화재연구소, 『(중요무형문화재 제10호)나전장』, 민속원, 2006\n" +
                    "권상오, 『나전공예』, 대원사, 2007\n" +
                    "김윤경, 『한눈에 보는 나전칠기』, 한국공예디자인문화진흥원, 2011"
        } else if (index == 9) {
            myMap["subTitle"] = "貝 · Horned turban shell"
            myMap["title"] = "뿔고동"
            myMap["manufacturer"] = "평화자개"
            myMap["writer"] = "이선주"
            myMap["company"] = "-"
            myMap["specification"] = "10.5×9.3×7.3"
            myMap["texture"] = "소라류"
            myMap["summary"] =
                "한국이 주산지인 소라패의 일종"
            myMap["basic1"] =
                "한국이 주산지로 제주도산이 가장 우수하다. 참소라, 뿔소라로 많이 알려져 있다. 자개 빛깔은 붉은색과 푸른색이 조화를 이루어 청패와 색이 비슷하다. 가공하여 얻는 자개 면적이 좁고 작아 끊음질에 사용할 수 있으나 경제성은 없다."
            myMap["basic2"] =
                "칠기에 사용되는 소라류로 야광패, 수도리패, 뿔소라패가 있다. 특유의 나선 형태로 인해 악기나 술잔으로도 사용된 소라류는 예로부터 중국, 일본에서 자개 재료로 사용되었다. 소라류의 껍데기 안쪽은 회백색으로 진주빛이 강하고 은은한 색을 띤다. 전복패와 달리 소라패는 나선을 따라 길게 잘라서 가공하기 때문에 길이가 긴 자개를 얻을 수 있다. 나무와 같이 얇고 긴 문양을 표현할 때 적합하다. 가공 부위에 따라 앞장, 중장, 귀패로 나뉘며 길이가 가장 길고 색상이 좋은 앞장이 선호된다. 줄음질과 끊음질용으로 사용되며 두께가 두꺼워 단추로 제작되기도 한다."
            myMap["reference"] = "국립문화재연구소, 『(중요무형문화재 제10호)나전장』, 민속원, 2006\n" +
                    "권상오, 『나전공예』, 대원사, 2007\n" +
                    "김윤경, 『한눈에 보는 나전칠기』, 한국공예디자인문화진흥원, 2011"
        } else if (index == 10) {
            myMap["subTitle"] = "貝 · White-lip pearl oyster shell"
            myMap["title"] = "진주패"
            myMap["manufacturer"] = "평화자개"
            myMap["writer"] = "이선주"
            myMap["company"] = "-"
            myMap["specification"] = "21.5×20.8×2.8"
            myMap["texture"] = "조개류"
            myMap["summary"] =
                "필리핀, 인도네시아가 주산지인 진주패의 일종"
            myMap["basic1"] =
                "주산지는 필리핀, 인도네시아로 자개는 백색빛을 낸다. 진주패는 껍데기 겉면만 갈아내어 자개를 두껍게 가공한다. 한국에서 60~70년대에 유행한 자개 장롱에 공작, 원앙 등 문양을 조각하는데 많이 쓰였다."
            myMap["basic2"] =
                "칠기에 사용되는 진주패류는 진주를 만들어내는 두꺼운 바닷조개이다. 껍데기가 큰 종류가 많아 자개로 활용도가 높다. 껍데기는 상하 대칭을 이루며 윗부분은 볼록하고 아랫부분은 평평하다. 자개가 두꺼워 이를 조각하여 입체적인 효과를 내는 데 많이 사용한다. 가공 부위에 따라 앞장, 뒷장, 귀패로 나뉘며 자개는 중심부가 밝고 가장자리로 갈수록 어두운 색을 띤다. 껍데기 색상에 따라 백패, 황패, 홍패, 흑패로 나뉜다."
            myMap["reference"] = "국립문화재연구소, 『(중요무형문화재 제10호)나전장』, 민속원, 2006\n" +
                    "권상오, 『나전공예』, 대원사, 2007\n" +
                    "김윤경, 『한눈에 보는 나전칠기』, 한국공예디자인문화진흥원, 2011"
        } else if (index == 11) {
            myMap["subTitle"] = "貝 · Penguin wing oyster shell"
            myMap["title"] = "홍진주패"
            myMap["manufacturer"] = "평화자개"
            myMap["writer"] = "이선주"
            myMap["company"] = "-"
            myMap["specification"] = "17.2×11.4×3.1"
            myMap["texture"] = "조개류"
            myMap["summary"] =
                "필리핀, 인도네시아가 주산지인 붉은 진주패의 일종"
            myMap["basic1"] =
                "필리핀과 인도네시아가 주산지로 펭귄패라고도 불린다. 위쪽 껍데기는 등 부분이 볼록하게 올라와 있고, 아래쪽 껍데기는 비교적 납작하나 색상은 위쪽 껍데기가 더 좋다. 자개는 붉은빛을 띠는 갈색으로 아랫부분의 색이 연하고 윗부분으로 갈수록 색이 진해지는 게 특징이다."
            myMap["basic2"] =
                "칠기에 사용되는 진주패류는 진주를 만들어내는 두꺼운 바닷조개이다. 껍데기가 큰 종류가 많아 자개로 활용도가 높다. 껍데기는 상하 대칭을 이루며 윗부분은 볼록하고 아랫부분은 평평하다. 자개가 두꺼워 이를 조각하여 입체적인 효과를 내는 데 많이 사용한다. 가공 부위에 따라 앞장, 뒷장, 귀패로 나뉘며 자개는 중심부가 밝고 가장자리로 갈수록 어두운 색을 띤다. 껍데기 색상에 따라 백패, 황패, 홍패, 흑패로 나뉜다."
            myMap["reference"] = "국립문화재연구소, 『(중요무형문화재 제10호)나전장』, 민속원, 2006\n" +
                    "권상오, 『나전공예』, 대원사, 2007\n" +
                    "김윤경, 『한눈에 보는 나전칠기』, 한국공예디자인문화진흥원, 2011"
        } else if (index == 12) {
            myMap["subTitle"] = "貝 · Black-lip pearl oyster shell"
            myMap["title"] = "흑진주패"
            myMap["manufacturer"] = "평화자개"
            myMap["writer"] = "이선주"
            myMap["company"] = "-"
            myMap["specification"] = "13.4×12.1×1.9"
            myMap["texture"] = "조개류"
            myMap["summary"] =
                "필리핀, 인도네시아, 타히티를 주산지로 하는 검은 진주패의 일종"
            myMap["basic1"] =
                "필리핀, 인도네시아, 타히티를 주산지로 한다. 껍데기는 기본적으로 흑색을 띠며 백색과 황색, 갈색이 섞인 것도 있다. 타히티에서 생산되는 것이 가장 크고 껍데기의 흑색이 선명하며 자개의 두께가 두껍다. 반면 필리핀과 인도네시아산은 껍데기에 흑색과 황색이 섞여 있으며 자개의 두께가 얇다."
            myMap["basic2"] =
                "칠기에 사용되는 진주패류는 진주를 만들어내는 두꺼운 바닷조개이다. 껍데기가 큰 종류가 많아 자개로 활용도가 높다. 껍데기는 상하 대칭을 이루며 윗부분은 볼록하고 아랫부분은 평평하다. 자개가 두꺼워 이를 조각하여 입체적인 효과를 내는 데 많이 사용한다. 가공 부위에 따라 앞장, 뒷장, 귀패로 나뉘며 자개는 중심부가 밝고 가장자리로 갈수록 어두운 색을 띤다. 껍데기 색상에 따라 백패, 황패, 홍패, 흑패로 나뉜다."
            myMap["reference"] = "국립문화재연구소, 『(중요무형문화재 제10호)나전장』, 민속원, 2006\n" +
                    "권상오, 『나전공예』, 대원사, 2007\n" +
                    "김윤경, 『한눈에 보는 나전칠기』, 한국공예디자인문화진흥원, 2011"
        } else if (index == 13) {
            myMap["subTitle"] = "貝 ·River Shell"
            myMap["title"] = "민물패"
            myMap["manufacturer"] = "평화자개"
            myMap["writer"] = "이선주"
            myMap["company"] = "-"
            myMap["specification"] = "17.3×10.5×2.7"
            myMap["texture"] = "조개류"
            myMap["summary"] =
                "한국과 중국, 일본, 동남아시아에서 생산되는 민물패류의 총칭"
            myMap["basic1"] =
                "한국의 낙동강 하류와 중국, 일본, 동남아시아의 강이나 호수에 서식하는 민물패류를 통틀어 이른 것이다. 자개가 매우 단단하여 가공이 어렵기 때문에 국내에서는 거의 사용하지 않으나 중국, 베트남에서 많이 활용한다."
            myMap["basic2"] =
                "민물패류에는 개합(蚧蛤, 말조개), 마음패(馬陰貝, 뻘조개) 등을 가공하여 민물패라 한다. 민물패류는 5년 이상 성장해야 진주층이 형성되어 자개의 색이 좋고 상하 껍데기를 마주했을 때 알 모양으로 좌우대칭이 된다."
            myMap["reference"] = "국립문화재연구소, 『(중요무형문화재 제10호)나전장』, 민속원, 2006\n" +
                    "권상오, 『나전공예』, 대원사, 2007\n" +
                    "김윤경, 『한눈에 보는 나전칠기』, 한국공예디자인문화진흥원, 2011"
        }
        return myMap
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        leftButton.setOnClickListener { replaceWithSecondFragment()
            CustomToast.cancelToast() }

        val contentArray = arrayOf(content1, content2, content3, content4, content5,content6, content7, content8, content9, content10, content11, content12, content13, content14)

        contentArray.forEachIndexed { index, content ->
            content.setOnClickListener {
                val intent = Intent(requireActivity(), ContentDetailActivity33::class.java)

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
            .replace(R.id.detail_content_frame3, Content331Fragment())
            .addToBackStack(null)
            .commit()
    }
}