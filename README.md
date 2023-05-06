# SOLID-SoftwareLab-
<div style="text-align: right"> 
در این پیاده‌سازی، با استفاده از کلاس abstract، هر دو اصل OCP و LSP را رعایت کرده‌ام. به این شکل که اگر مربع را زیرکلاس مستطیل قرار می‌دادم، اولا برای ساخت مربع، باید precondition بیشتری از پدر برقرار می‌شد که برابر بودن عرض و طول  بود که باعث می‌شد مربع همه جا نتواند نوعی مستطیل باشد و LSP نقض می‌شد و از طرفی، اگر به عنوان مثال در آینده تابعی برای افزایش مساحت مستطیل می‌خواستیم که به عنوان مثال x درصد افزایش داشته باشد، کافی بود یکی از اضلاع را x درصد افزایش دهیم در صورتی که این باعث می‌شود که مساحت مربع بیشتر افزایش پیدا کند و این ویژگی مستطیل برای مربع صادق نخواهد بود که نشان می‌دهد کد ما نسبت به extension بسته است یا اگر چیزی اضافه کنیم، نیازمند modification هستیم که نقض اصل OCP است
<bold> سوالات </bold>
<ol>
   <li>
     این اصول به این ترتیب هستند
<par>
SRP: یک کلاس یا ماژول باید تنها یک دلیل برای تغییر داشته باشد، یعنی باید نسبت به یک actor واحد مسئولیت داشته باشد. این منجر به سازماندهی بهتر کد، تست آسان تر و وابستگی کمتر به ماژول ها یا کلاس های دیگر می شود
      </par>
   </li>
   <li>
numbered point two
   </li>
</ol> 
</div>
