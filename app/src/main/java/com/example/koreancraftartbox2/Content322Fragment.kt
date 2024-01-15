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
import kotlinx.android.synthetic.main.fragment_content322.*


class Content322Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_content322, container, false)
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
            myMap["subTitle"] = "平脫技法(統一新羅時代)\n" +
                    "Pyeongtal Technique(Unified Silla period)"
            myMap["title"] = "평탈(통일신라)"
            myMap["manufacturer"] = "이선주"
            myMap["writer"] = "이선주"
            myMap["company"] = "서울공예박물관"
            myMap["specification"] = "14.0(Ø)×1.5"
            myMap["texture"] = "피나무에 백동, 황동"
            myMap["summary"] =
                "통일신라에 유행한 칠기 장식기법으로 금이나 은으로 만든 얇은 금속판을 기물에 붙여 장식하는 방법"
            myMap["basic"] =
                "얇은 금속판을 칠기에 붙여 장식하는 평탈(平脫)은 나전의 시원(始原)이 되는 기법으로 파악된다. 문양대로 오린 금속판에 조이질하여 문양의 세부를 묘사하는데 새기는 방법에 따라 크게 투각(透刻)과 선각(線刻)으로 나뉜다. 선각기법에서도 정이 새겨진 모양에 따라 선조(線彫), 점조(點彫), 축조(蹴彫), 모조(毛彫) 등으로 구분된다. 표본은 국립중앙박물관 소장 <꽃 동물무\n늬 붙인 옻칠거울>을 모티프로 제작한 것이다."

            myMap["history2"] =
                "한국에서는 삼국시대에 당의 영향으로 평탈과 나전 기법이 유입된 것으로 추정된다. 일본 정창원(正倉院)에 소장된 보물의 명칭과 수량을 기록한 『국가진보장(國家珍寶帳)』을 보면 백제 의자왕이 일본에 선물한 물품 중 '은평탈합'이 포함되어 있어 통일신라시대에 평탈 칠기가 활발히 제작된 것을 알 수 있다."

            myMap["history"] =
                "한국 문헌에서는 『삼국사기(三國史記)』에 ‘평문(平文)'이라는 용어가 확인된다. 평문은 평탈을 지칭하는 것으로, 중국과 일본의 문헌에는 두 가지 용어가 모두 사용된다. 평탈은 기물에 문양대로 오린 금속판을 붙이고 옻칠을 한두 번 칠한 뒤 금속판 위의 칠층만 벗겨내어 마무리하는 것으로 금속판의 높이가 바탕보다 높다. 반면 평문은 바탕과 금속판의 높이를 맞추어 제작하는 것으로 구분짓는다."
            myMap["reference"] = "신숙, 「전통 공예기법의 단절과 계승 : 평문과 평탈, 그리고 나전」, 『무형유산』 Vol.6, 국립무형유산원, 2019"
        } else if (index == 1) {
            myMap["subTitle"] = "螺鈿技法(高麗時代)\n" +
                    "Mother-of-pearl Technique(Goryeo Dynasty)"
            myMap["title"] = "나전(고려)"
            myMap["manufacturer"] = "이선주"
            myMap["writer"] = "이선주"
            myMap["company"] = "서울공예박물관"
            myMap["specification"] = "14.0(Ø)×1.5"
            myMap["texture"] = "피나무에 나전\n" +
                    "(색패)"
            myMap["summary"] =
                "고려시대에 유행한 칠기 장식기법으로 나전과 금속선으로 기물을 장식하는 방법"
            myMap["basic"] =
                "고려시대부터 전복의 껍데기를 가공하여 만든 자개가 칠기에 장식되었다. 폭 1~2mm로 정교하게 절삭된 자개와 두 개를 꼬아 만든 금속선을 함께 사용하는 것이 특징이다. 표본은 국립중앙박물관 소장 <나전경함>을 모티프로 제작한 것이다."

            myMap["history"] =
                "한국에서 나전칠기는 고려시대부터 본격적으로 제작되었다. 당시 고려 나전에 대한 평가는 1123년 고려를 방문한 송나라 사신 서긍이 쓴 『선화봉사고려도경(宣和奉使高麗圖經)』에 기록되어 있다. 여기에는 '칠을 다루는 기술은 능하지 않지만, 나전 기술은 가히 세밀하고 귀하다(用漆作不甚工, 而螺鈿之工, 細密可貴)'라고 하였다. 또한 '말 안장은 정교한데 그것은 나전의 안장이다(騎兵所乗鞍韉精巧, 螺鈿為鞍)'라고 하여 고려의 정교한 나전 기술을 확인할 수 있다."
            myMap["reference"] = "최영숙, 「高麗時代 螺鈿漆器 硏究」, 『미술사연구』 15, 미술사연구회, 2001."
        } else if (index == 2) {
            myMap["subTitle"] = "螺鈿技法(朝鮮時代)\n" +
                    "Mother-of-pearl Technique(Joseon Dynasty)"
            myMap["title"] = "나전(조선-줄음질)"
            myMap["manufacturer"] = "이선주"
            myMap["writer"] = "이선주"
            myMap["company"] = "서울공예박물관"
            myMap["specification"] = "14.0(Ø)×1.5"
            myMap["texture"] = "피나무에 나전\n" +
                    "(색패)"
            myMap["summary"] =
                "조선시대에 유행한 칠기 장식기법으로 자개를 문양에 맞게 오리는 방법"
            myMap["basic"] =
                "표본은 서울공예박물관 소장 <나전 연화문 함>을 모티프로 제작한 것이다. 이 유물은 덩굴의 둥근 선을 끊음질로 표현하고, 줄음질로 모란 꽃잎을 오린\n것이 특징이다."

            myMap["history2"] =
                "조선시대에는 고려시대에 비해 문양의 크기가 커지고 바탕 여백이 생기면서 다양한 문양이 활용된다. 조선 왕실에서는 전복을 가공한 자개 제작과 칠기 장식을 전담하는 나전장(螺鈿匠)을 두어 국가 의례와 외교 선물로 사용할 나전칠기를 제작하였다. 왕실의 위엄을 시각적으로 보여주는 용, 봉황 등의 문양을 주로 사용하였다."

            myMap["history"] =
                "조선 후기에는 상공업이 발달하면서 민간에서 공예품의 수요가 증가하였다. 장수와 복을 기원하는 십장생문과 각종 길상문이 성행하여 칠기에 장식되었다. 제작기법도 문양을 크게 오려 장식하는 줄음질 위주였던 조선 전기와 달리 후기에는 대량생산을 위해 끊음질 중심으로 자개를 적게 사용하면서 넓은 면적을 꾸몄다. 끊음질은 산수문과 기하학 무늬 표현에 사용되었다."
            myMap["reference"] = "국립중앙박물관, 『나전칠기 : 천년을 이어 온 빛』, 고호, 2006."
        } else if (index == 3) {
            myMap["subTitle"] = "螺鈿技法(朝鮮時代)\n" +
                    "Mother-of-pearl Technique(Joseon Dynasty)"
            myMap["title"] = "나전(조선-끊음질)"
            myMap["manufacturer"] = "이선주"
            myMap["writer"] = "이선주"
            myMap["company"] = "서울공예박물관"
            myMap["specification"] = "14.0(Ø)×1.5"
            myMap["texture"] = "피나무에 나전\n" +
                    "(색패)"
            myMap["summary"] =
                "조선시대에 유행한 칠기 장식기법으로 자개를 길고 가늘게 자른 상사를 기물에 끊어가며 붙이는 방법"
            myMap["basic"] =
                "표본은 서울공예박물관 소장 <나전칠 장생무늬 함>을 모티프로 제작한 것이다. 이 유물은 조선 후기 나전칠기에 사용된 전형적인 문양 배치를 볼 수 있다. 줄음질로 오린 십장생문은 모조법으로 세부를 생동감있게 표현했으며, 끊음\n질로 산수와 가장자리의 기하학 무늬를 장식했다."

            myMap["history2"] =
                "조선시대에는 고려시대에 비해 문양의 크기가 커지고 바탕 여백이 생기면서 다양한 문양이 활용된다. 조선 왕실에서는 전복을 가공한 자개 제작과 칠기 장식을 전담하는 나전장(螺鈿匠)을 두어 국가 의례와 외교 선물로 사용할 나전칠기를 제작하였다. 왕실의 위엄을 시각적으로 보여주는 용, 봉황 등의 문양을 주로 사용하였다."

            myMap["history"] =
                "조선 후기에는 상공업이 발달하면서 민간에서 공예품의 수요가 증가하였다. 장수와 복을 기원하는 십장생문과 각종 길상문이 성행하여 칠기에 장식되었다. 제작기법도 문양을 크게 오려 장식하는 줄음질 위주였던 조선 전기와 달리 후기에는 대량생산을 위해 끊음질 중심으로 자개를 적게 사용하면서 넓은 면적을 꾸몄다. 끊음질은 산수문과 기하학 무늬 표현에 사용되었다."
            myMap["reference"] = "국립중앙박물관, 『나전칠기 : 천년을 이어 온 빛』, 고호, 2006."
        } else if (index == 4) {
            myMap["subTitle"] = "螺鈿技法(高麗時代)\n" +
                    "Mother-of-pearl Technique(Joseon Dynasty)"
            myMap["title"] = "나전(조선-타찰법)"
            myMap["manufacturer"] = "이선주"
            myMap["writer"] = "이선주"
            myMap["company"] = "서울공예박물관"
            myMap["specification"] = "14.0(Ø)×1.5"
            myMap["texture"] = "피나무에 나전\n" +
                    "(색패)"
            myMap["summary"] =
                "조선시대에 유행한 칠기 장식기법으로 줄음질로 오려 기물에 붙인 자개에 균열을 넣는 방법\n"
            myMap["basic"] =
                "줄음질로 오린 자개에 자개칼로 눌러 균열을 내는 기법이다. 전복으로 만든 자개는 껍데기 특성상 가공 후에도 굴곡이 남아있는데, 이를 평평하게 붙이기 위해 균열을 준 것에서 유래한 기법으로 추정된다. 표본은 국립중앙박물관 소장 <나전칠 포도무늬 서류함>을 모티프로 제작한 것이다."

            myMap["history2"] =
                "조선시대에는 고려시대에 비해 문양의 크기가 커지고 바탕 여백이 생기면서 다양한 문양이 활용된다. 조선 왕실에서는 전복을 가공한 자개 제작과 칠기 장식을 전담하는 나전장(螺鈿匠)을 두어 국가 의례와 외교 선물로 사용할 나전칠기를 제작하였다. 왕실의 위엄을 시각적으로 보여주는 용, 봉황 등의 문양을 주로 사용하였다."

            myMap["history"] =
                "조선 후기에는 상공업이 발달하면서 민간에서 공예품의 수요가 증가하였다. 장수와 복을 기원하는 십장생문과 각종 길상문이 성행하여 칠기에 장식되었다. 제작기법도 문양을 크게 오려 장식하는 줄음질 위주였던 조선 전기와 달리 후기에는 대량생산을 위해 끊음질 중심으로 자개를 적게 사용하면서 넓은 면적을 꾸몄다. 끊음질은 산수문과 기하학 무늬 표현에 사용되었다."
            myMap["reference"] = "국립중앙박물관, 『나전칠기 : 천년을 이어 온 빛』, 고호, 2006."
        } else if (index == 5) {
            myMap["subTitle"] = "螺鈿技法(朝鮮時代 ・割貝法)\n" +
                    "Mother-of-pearl Technique(Joseon Dynasty)"
            myMap["title"] = "나전(조선-할패법)"
            myMap["manufacturer"] = "이선주"
            myMap["writer"] = "이선주"
            myMap["company"] = "서울공예박물관"
            myMap["specification"] = "14.0(Ø)×1.5"
            myMap["texture"] = "피나무에 나전\n" +
                    "(색패)"
            myMap["summary"] =
                "조선시대에 유행한 칠기 장식기법으로 자개를 기물에 1장씩 균열을 주며 붙이는 방법"
            myMap["basic"] =
                "조선 후기에 자개를 기물 전면에 붙여 표현하는 할패법이 나타난다. 자개에 균열을 준다는 점에서 타찰법과 비슷해 보이지만, 타찰법은 문양에 따라 오린 자개에 균열을 주고 할패법은 자개 한 장을 그대로 붙인다는 점에서 차이가 있\n다. 표본은 서울공예박물관 소장 <나전함>을 모티프로 제작하였다."

            myMap["history2"] =
                "조선시대에는 고려시대에 비해 문양의 크기가 커지고 바탕 여백이 생기면서 다양한 문양이 활용된다. 조선 왕실에서는 전복을 가공한 자개 제작과 칠기 장식을 전담하는 나전장(螺鈿匠)을 두어 국가 의례와 외교 선물로 사용할 나전칠기를 제작하였다. 왕실의 위엄을 시각적으로 보여주는 용, 봉황 등의 문양을 주로 사용하였다."

            myMap["history"] =
                "조선 후기에는 상공업이 발달하면서 민간에서 공예품의 수요가 증가하였다. 장수와 복을 기원하는 십장생문과 각종 길상문이 성행하여 칠기에 장식되었다. 제작기법도 문양을 크게 오려 장식하는 줄음질 위주였던 조선 전기와 달리 후기에는 대량생산을 위해 끊음질 중심으로 자개를 적게 사용하면서 넓은 면적을 꾸몄다. 끊음질은 산수문과 기하학 무늬 표현에 사용되었다."
            myMap["reference"] = "국립중앙박물관, 『나전칠기 : 천년을 이어 온 빛』, 고호, 2006."
        } else if (index == 6) {
            myMap["subTitle"] = "螺鈿技法(日帝強占期)\n" +
                    "Mother-of-pearl Technique(Japanese occupation)"
            myMap["title"] = "나전(일제강점기)"
            myMap["manufacturer"] = "이선주"
            myMap["writer"] = "이선주"
            myMap["company"] = "서울공예박물관"
            myMap["specification"] = "14.0(Ø)×1.5"
            myMap["texture"] = "피나무에 나전\n" +
                    "(색패)"
            myMap["summary"] =
                "일제강점기에 도입된 칠기 장식기법으로 나전으로 장식한 칠기에 금가루나 건칠분을 뿌려 입체적으로 표현하는 방법"
            myMap["basic"] =
                "표본은 서울공예박물관 소장 <나전칠 산수무늬 벼루함>을 모티프로 제작하였다. 이 유물은 나전으로 산수무늬를 표현하고 주변에 황색의 건칠분을 뿌려 명암을 넣었다. 근대기 도입된 나전시회 기법의 전형을 보여준다."

            myMap["history"] =
                "일제강점기 일본인이 경영하는 제작소에 장인이 근무하거나 일본 유학파 출\n신 작가가 활동하면서 일본의 칠기 기법이 유입되었다. 그중 가장 큰 변화는\n시회(蒔絵, 마키에) 기법 나전과 병용된 것이다. 시회는 금가루를 뿌려 문양\n에 명암을 넣어 회화적으로 표현하는 기법이다. 일본에서는 전통적으로 금가루와 은가루처럼 금속분을 사용했지만, 근대에는 옻칠을 건조하여 분말화 한 건칠분이 개발되면서 시회로 다양한 색상을 표현하였다."
            myMap["reference"] = "국립중앙박물관, 『나전칠기 : 천년을 이어 온 빛』, 고호, 2006."
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
                val intent = Intent(requireActivity(), ContentDetailActivity32::class.java)

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
            .replace(R.id.detail_content_frame3, Content321Fragment())
            .addToBackStack(null)
            .commit()
    }
}