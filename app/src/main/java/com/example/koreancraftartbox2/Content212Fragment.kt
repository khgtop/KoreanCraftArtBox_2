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
import kotlinx.android.synthetic.main.fragment_content212.*


class Content212Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_content212, container, false)
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
            myMap["subTitle"] = "骨粉 · Bone Powder"
            myMap["title"] = "골분(골회칠)"
            myMap["detail_title"] = "골분"
            myMap["manufacturer"] = "이선주"
            myMap["writer"] = "이선주, 신성필"
            myMap["company"] = "서울공예박물관"
            myMap["specification"] = "8.5×8.5×1.5"
            myMap["texture"] = "피나무에 골회"
            myMap["summary"] =
                "옻칠과 동물의 뼈를 분쇄하여 만든 골분을 섞어 만든 회칠"
            myMap["basic"] =
                "표본은 옻칠과 구운 돼지뼈를 분쇄하여 만든 골분으로 만든 골회칠을 도포한 것이다. 골회칠을 사용한 칠기 유물을 보면 마감 방식에 따라 입자가 다르게\n보이는데, 그 차이를 보여주기 위해 회칠을 바르고 연마한 시편과 연마 후 칠을 한 것의 두 종류를 전시하였다."
            myMap["history"] =
                "칠기의 면을 정리하고 층을 쌓는 회칠의 재료인 골분은 중국 한나라 때부터 확인된다. 한국에서는 낙랑 유물에서 보이기 시작하여 계속 사용된다. 특히 고려시대에서 조선시대 중기까지 두드러진다. 이 시기 제작된 나전칠기는 국립중앙박물관 소장 <나전 칠 포도 무늬 서류함>처럼 칠층을 얇게 처리하여 밝은 갈색을 띠면서 골분 입자가 드러난다. 조선 후기 제작된 나전칠기는 골회층 위 칠층을 두껍게 처리하여 색이 어두우면서 골분 입자가 거의 드러나지 않는다. 칠기 유물의 분석자료가 적어 골분의 등장시기를 명확히 규명하기 어려우나 골분이 예전부터 널리 사용된 것은 여러 조사를 통해 밝혀졌다."

            myMap["science1"] = "광학현미경(투과광, 반사광, 편광), SEM-EDS"
            myMap["science2"] = "분석표본은 <목재-생칠-회칠(골회칠)-생칠-정제칠-정제칠> 순으로 제작되었다. 광학현미경으로 관찰해보면 투과광 조건에서 칠도막의 특징이 확인된다. 목재 위 생칠이 목재조직 내부에 스며든 상태이며 그 위 골분이 섞인 회칠층이 자리한다. 회칠 위로는 밝은 황색의 생칠층이 있으며 그 위로 2개의 정제칠층이 확인된다. 가장 위의 정제칠층은 생칠 다음의 정제칠층보다 색이 밝으며 아주 얇게 도포되어 있다. 골분(얇게) 시편은 골분(두껍게) 시편보다 골회칠 위 칠층의 두께가 7.4 ㎛ 이상 얇다. SEM-EDS 분석 결과, 목심과 옻칠 층은 탄소(C)와 산소(O)가 주성분으로 검출되며, 골회칠 과 골분은 탄소(C), 산소(O)와 함께 Ca(칼슘)과 P(인)이 주성분으로 검출되었다."
            myMap["reference"] = "이용희, 「우리나라 고대칠기의 칠기법 연구: 초기철기시대부터 통일신라시대까지 발굴 칠기유물을 중심으로」, 공주대학교 석사학위논문, 2010\n" +
                    "조훈상 외, 『한눈에 보는 옻칠』, 한국공예·디자인문화진흥원, 2017\n" +
                    "박영만 외, 『보존과 복원의 세계 나전칠기』, 국립중앙박물관, 2019\n" +
                    "이오희,  『천년기술 옻칠 문화재 보존』, 주류성, 2020"
        } else if (index == 1) {
            myMap["subTitle"] = "土粉 · Soil Powder"
            myMap["title"] = "토분(토회칠)"
            myMap["detail_title"] = "토분"
            myMap["manufacturer"] = "이선주"
            myMap["writer"] = "이선주, 신성필"
            myMap["company"] = "서울공예박물관"
            myMap["specification"] = "8.5×8.5×1.5"
            myMap["texture"] = "피나무에 토회"
            myMap["summary"] =
                "옻칠과 황토 흙으로 만든 토분을 섞어 만든 회칠"
            myMap["basic"] =
                "표본은 옻칠과 황토 흙으로 만든 토분으로 만든 토회칠을 도포한 것이다. 황토 흙을 물에 넣으면 고운 가루가 물에 뜨는데, 이를 모아 건조시켜 토분을 만든다. 토회칠은 현재 칠기를 제작할 때 가장 보편적으로 사용하는 회칠이다."
            myMap["history"] =
                "토분은 고대부터 칠기 회칠의 재료 중 하나로 사용되었다. 낙랑칠기와 삼국시대 유물에서 토분과 골분을 함께 사용한 사례가 발견되며, 고려시대와 조선시대 유물에는 골분이나 목탄분과 함께 소량 섞어 사용한 것이 확인된다. 토분이 회칠 재료로 단독으로 사용된 것은 근대 이후이다."

            myMap["science1"] = "광학현미경(투과광, 반사광, 편광), SEM-EDS"
            myMap["science2"] = "분석표본은 <목재-생칠-회칠(토회칠)-생칠-정제칠-정제칠> 순으로 제작되었다. 광학현미경으로 관찰해보면 투과광 조건에서 칠도막의 특징이 확인된다. 목재 위 생칠이 목재조직 내부에 스며든 상태이며 그 위 투명 광물을 함유한 토분이 섞인 회칠층이 자리한다. 회칠 위 밝은 황색의 생칠이 확인되는데 회칠층 사이에 스며든 상태이다. 그 위로 아주 얇은 두께의 정제칠층이 보인다. SEM-EDS 분석 결과, 생칠이 스며든 토회칠층에서 탄소(C), 산소(O), Si(규소), Al(알루미늄)과 미량의 Fe(철), K(칼륨), Mg(마그네슘), Ti(티타늄)이 검출되었다. 토회칠의 토분 입자만을 분석하면 산소(O)와 Si(규소) 성분이 주성분으로 분석되어 석영 입자가 혼합되어 있음을 알 수 있다. 목심과 옻칠층은 주성분이 탄소(C)와 산소(O)이다."
            myMap["reference"] = "이용희, 「우리나라 고대칠기의 칠기법 연구: 초기철기시대부터 통일신라시대까지 발굴 칠기유물을 중심으로」, 공주대학교 석사학위논문, 2010\n" +
                    "조훈상 외, 『한눈에 보는 옻칠』, 한국공예·디자인문화진흥원, 2017\n" +
                    "박영만 외, 『보존과 복원의 세계 나전칠기』, 국립중앙박물관, 2019\n" +
                    "이오희,  『천년기술 옻칠 문화재 보존』, 주류성, 2020"
        } else if (index == 2) {
            myMap["subTitle"] = "木炭粉 · Charcoal Powder"
            myMap["title"] = "목탄분(탄회칠)"
            myMap["detail_title"] = "목탄분"
            myMap["manufacturer"] = "이선주"
            myMap["writer"] = "이선주, 신성필"
            myMap["company"] = "서울공예박물관"
            myMap["specification"] = "8.5×8.5×1.5"
            myMap["texture"] = "피나무에 탄회"
            myMap["summary"] =
                "옻칠과 참나무숯으로 만든 목탄분을 섞어 만든 회칠"
            myMap["basic"] =
                "표본은 옻칠과 참나무숯으로 만든 목탄분으로 만든 탄회칠을 도포한 것이다. 목탄분은 참나무숯을 분쇄한 뒤 200㎛ 크기의 거름망에 걸러 만들었다."
            myMap["history"] =
                "목탄분은 낙랑시대와 삼국시대 칠기 유물에서 확인되나 주로 조선 후기 민간 양식의 나전칠기 유물에서 검출된다. 목탄분을 넣어 만든 탄회칠은 칠면을 검게 만들어 옻칠을 많이 한 것 같은 시각적 효과를 준다. 따라서 옻칠을 절약할 수 있으므로 민간에서 급증한 나전칠기의 수요를 맞추기 위해 사용하게 된 것으로 추정된다."

            myMap["science1"] = "광학현미경(투과광, 반사광, 편광), SEM-EDS"
            myMap["science2"] = "분석표본은 <목재-생칠-회칠(탄회칠)-생칠-정제칠-정제칠> 순으로 제작되었다. 광학현미경으로 관찰해보면 투과광과 반사광 조건에서 회칠 속 목탄의 조직구조가 확인된다. 목재 위 생칠이 목재조직 내부에 스며든 상태이며 그 위 검거나 짙은 갈색의 목탄분이 섞인 회칠층이 자리한다. 목탄분은 골분과 토분에 비해 기공이 많으므로 회칠층 위 생칠은 회칠층으로 대부분 흡수된 상태이다. 그 위로 얇은 두께의 정제칠층이 보인다. SEM-EDS 분석 결과, 목탄 입자는 목재조직의 특징이 확인되어 탄소(C)와 산소(O)가 주성분으로 분석된다. 생칠과 목탄분이 섞인 부분은 토양에 존재하는 규산염광물의 영향으로 미량의 Na(나트륨), Mg(마그네슘), K(칼륨), Ca(칼슘)이 함께 검출된다. 목심과 옻칠층은 탄소(C)와 산소(O)가 주성분이다."
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

        val contentArray = arrayOf(content1, content2, content3)

        contentArray.forEachIndexed { index, content ->
            content.setOnClickListener {
                val intent = Intent(requireActivity(), ContentDetailActivity2::class.java)

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
            .replace(R.id.detail_content_frame2, Content211Fragment())
            .addToBackStack(null)
            .commit()
    }
}