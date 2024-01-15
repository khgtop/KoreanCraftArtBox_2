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
import kotlinx.android.synthetic.main.fragment_content222.*

class Content222Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_content222, container, false)
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
            myMap["subTitle"] = "金箔 · Giltwood"
            myMap["title"] = "금박"
            myMap["manufacturer"] = "이선주, 신현일"
            myMap["writer"] = "이선주"
            myMap["company"] = "서울공예박물관"
            myMap["specification"] = "14.0(Ø)×1.5"
            myMap["texture"] = "피나무에 금박"
            myMap["summary"] =
                "옻칠을 접착제로 사용하여 금박을 입히는 기법"
            myMap["basic"] =
                "옻칠을 접착제로 하여 금박을 입히는 도금법은 주로 불상에서 확인된다. 본 표본은 이러한 특징이 잘 드러나는 고려 말~조선 초에 제작된 국립중앙박물관 소장 <건칠보살좌상>의 제작기법을 토대로 제작하였다."

            myMap["history2"] =
                "칠기에 금박을 붙이는 방법은 첩금법과 도금법으로 나눌 수 있다. 첩금법은 중국 한나라때부터 유행하던 기법으로 문양대로 오린 금박을 칠기 표면에 붙이는 것이다. 국립부여박물관 소장 <금박채색칠기편>이 대표적이다. 비록 옻칠은 아니지만 붉은색 칠 위에 금박을 오려 붙여 장식한 <무령왕비 베개>에서도 확인할 수 있다."

            myMap["history"] =
                "도금법은 기물의 표면에 금속을 얇게 입혀 장식하는 것을 말한다. 고대부터 현재까지 금박을 붙일 때 접착력이 강한 옻칠을 접착제로 사용해왔다. 옻칠 도금은 주로 불상에서 볼 수 있으며, 접착제로 아교나 어교를 쓰기도 하지만 습기에 약한 단점이 있다. 1960년대 이후 옻칠 대용품인 캐슈가 생산되면서 옻칠 대신 캐슈로 도금하는 사례가 늘어났다."
             myMap["reference"] = "이윤주,「불상 도금법의 전통계승과 근대적 변화」, 『미술사연구』 36, 미술사연구회, 2019, pp.75-93."
        } else if (index == 1) {
            myMap["subTitle"] = "玳瑁, 金屬線, 金屬粉\n" +
                    "Turtle Skin, Metal Wire,  Metallic Powder"
            myMap["title"] = "대모와 금속선"
            myMap["manufacturer"] = "이선주"
            myMap["writer"] = "이선주"
            myMap["company"] = "서울공예박물관"
            myMap["specification"] = "14.0(Ø)×1.5"
            myMap["texture"] = "피나무에 대모,\n" +
                    "나전(색패)"
            myMap["summary"] =
                "대모와 나전, 금속선을 장식 재료로 사용하고 바탕에 금속분을 뿌려 장식하는 기법"
            myMap["basic"] =
                "조선 말기가 되면 고려시대 나전칠기의 특징인 대모복채법이 변형되어 나타\n나 대모와 어피, 금속선, 금속박(분)을 사용하게 된다. 본 시편은 이러한 특징이 잘 드러나는 서울공예박물관 소장 <나전 칠 대모장식 봉황무늬 상자>를 토대로 제작하였다."

            myMap["history2"] =
                "나전과 함께 많이 사용하는 칠기 장식재인 대모는 바다거북의 일종으로, 등껍질을 가공한 것이다. 대모의 등껍질은 반투명으로 황색 바탕에 다갈색의 반점이 특징이다. 고대부터 대모로 제작한 공예품이 다수 출토되었는데, 특히 고려시대부터 칠기 장식재로 쓰이기 시작했다. 대모복채법이라 하여 얇게 가공한 등껍질 안쪽에 안료를 칠해 비쳐 보이도록 하는 이 기법은 고려시대 나전칠기의 대표적인 장식기법 중 하나이다. 13~14세기가 되면 대모를 칠기에 장식하는 경향은 잠시 사라졌다가 조선 중기부터 다시 확인된다."

            myMap["history"] =
                "대모와 함께 사용되는 금속선은 기물의 외곽을 구획하거나 넝쿨무늬의 줄기, 문양의 테두리에 주로 쓰인다. 고려시대에는 황동제와 주석제 금속선이 사용되었으며, 조선시대에는 대부분 황동제 금속선으로 분석된다."
            myMap["reference"] = "박영만 외, 『보존과 복원의 세계 나전칠기』, 국립중앙박물관, 2019"
        } else if (index == 2) {
            myMap["subTitle"] = "魚皮 · Stingray Leather Technique"
            myMap["title"] = "어피"
            myMap["manufacturer"] = "이선주"
            myMap["writer"] = "이선주"
            myMap["company"] = "서울공예박물관"
            myMap["specification"] = "14.0(Ø)×1.5"
            myMap["texture"] = "피나무에 어피"
            myMap["summary"] =
                "바탕에 어피가죽을 붙이고 옻칠하는 기법"
            myMap["basic"] =
                "어피가죽에 옻칠하는 기법은 칠기의 문양 재료로 많이 사용한다. 본 표본은 서울공예박물관 소장 <어피함>을 토대로 제작하였는데, 어피에 흑칠을 하여 특유의 돌기가 도드라진 것이 특징이다."

            myMap["history"] =
                "상어나 가오리의 어피는 표면에 돌기가 있어 칠을 하고 연마하면 독특한 패턴이 보이게 된다. 이를 이용하여 칠기를 제작 시 문양을 부분적으로 강조할 때 사용한다. 가오리 어피의 표면은 돌기가 동글동글한 형태이며, 상어 어피는 마름모 형태의 돌기가 특징이다. 어피는 질기고 내구성이 좋아 기물의 외관을 감싸 보호하는 데도 쓰였는데, 조선시대 함이나 안경집, 칼집 등에서 볼 수 있다."

            myMap["reference"] = "박영만 외, 『보존과 복원의 세계 나전칠기』, 국립중앙박물관, 2019\n" +
                    "국립고궁박물관, 『조선왕실·대한제국 황실 문화재 보존연구2020 - 가죽문화재 식별 분석 공동연구서』, 국립고궁박물관, 2020"
        } else if (index == 3) {
            myMap["subTitle"] = "漆畫技法 · Lacquer Painting"
            myMap["title"] = "칠화"
            myMap["manufacturer"] = "이선주"
            myMap["writer"] = "이선주"
            myMap["company"] = "서울공예박물관"
            myMap["specification"] = "14.0(Ø)×1.5"
            myMap["texture"] = "피나무에 칠화"
            myMap["summary"] =
                "옻칠에 안료를 섞어 만든 색칠로 그림을 그려 장식하는 기법"
            myMap["basic"] =
                "옻칠에 안료를 섞어 만든 색칠로 그림을 그리는 칠화 기법은 아직 정확한 명칭이 없어 ‘칠화’, ‘채화’, ‘채칠’등 다양한 용어로 부른다. 본 표본은 미국 호놀룰루 미술관 소장 <흑칠채화 모란문 가께수리>를 대상으로 만든 표본이다."

            myMap["history"] =
                "삼국시대에 낙랑칠기의 영향을 받은 칠화기법이 발달하였다. 낙랑칠기의 검은색과 붉은색을 섞어 바르는 단계를 넘어 능산리사지 출토 칠기에서는 석황을 섞어 만든 황색 옻칠도 확인되었다. 삼국시대 이후로 칠화의 흔적은 보이지 않으나 조선시대 유물에서 드물게 확인된다. 현재는 색칠을 활용한 옻칠 회화 장르가 성립될 정도로 옻칠 작가들이 선호하는 기법이다."

            myMap["reference"] = "박영만 외, 『보존과 복원의 세계 나전칠기』, 국립중앙박물관, 2019\n" +
                    "국립고궁박물관, 『조선왕실·대한제국 황실 문화재 보존연구2020 - 가죽문화재 식별 분석 공동연구서』, 국립고궁박물관, 2020"
        } else if (index == 4) {
            myMap["subTitle"] = "卵殼技法 · Egg-Shell Technique"
            myMap["title"] = "난각"
            myMap["manufacturer"] = "이선주, 서민성"
            myMap["writer"] = "이선주"
            myMap["company"] = "서울공예박물관"
            myMap["specification"] = "14.0(Ø)×1.5"
            myMap["texture"] = "피나무에 난각"
            myMap["summary"] =
                "칠기에 조각낸 달걀 껍데기를 붙여 장식하는 기법"
            myMap["basic"] =
                "칠기에 조각낸 달걀 껍데기를 붙여 장식하는 기법으로, 근대에 새롭게 등장하였다. 본 표본은 근현대 옻칠 거장인 백태원 작가가 1995년도에 제작한 오브제인 국립현대미술관 소장 <병(甁)-51>을 참고하여 제작하였다."

            myMap["history"] =
                "옻칠은 고유의 진한 갈색으로 인해 흰색 안료를 섞어도 아이보리색을 띤다. 이러한 단점을 보완하여 칠기에 흰색을 표현하기 위해 사용한 것이 흰 달걀 껍질이다. 근대 일본의 인간국보 마츠다 곤로쿠(松田権六, 1896~1986)가 사용하면서 성행한 기법으로 한국에서는 백태원 작가가 많은 작품에서 활용했다. 대체로 검은 옻칠 바탕에 흰색의 달걀 껍데기를 붙여 흑과 백의 강한 대비를 이루며, 껍데기로 표현된 미세한 균열이 특징이다. 주로 닭이나 오리, 메추리, 거위 등의 알 껍데기를 사용한다."

        }
        return myMap
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        leftButton.setOnClickListener { replaceWithSecondFragment()
            CustomToast.cancelToast() }

        val contentArray = arrayOf(content1, content2, content3, content4, content5)

        contentArray.forEachIndexed { index, content ->
            content.setOnClickListener {
                val intent = Intent(requireActivity(), ContentDetailActivity31::class.java)

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
            .replace(R.id.detail_content_frame2, Content221Fragment())
            .addToBackStack(null)
            .commit()
    }
}