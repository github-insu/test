# HTML,CSS,JAVASCRIPT 없이 PYTHON만으로 웹 페이지 만들기
import streamlit as st

#raw data
view = [100,150,30]

#HTML에서 H태그 역할
st.write('# Youtube. view')
st.write('## raw')
view
st.write('## bar char')

#bar_chart 표시
st.bar_chart(view)

import pandas as pd

#pandas의 Series를 바로 보여줄 수 있음
sview = pd.Series(view)
sview
