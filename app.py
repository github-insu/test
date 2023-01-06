import streamlit as st
view = [100,150,30]
st.write('# Youtube. view')
st.write('## raw')
view
st.wirte('## bar char')
st.bar_char(view)

import pandas as pd
sview = pd.Series(view)
sview