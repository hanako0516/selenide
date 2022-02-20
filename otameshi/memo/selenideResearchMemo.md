# Selenideを調べたときのメモ

## 役に立ちそうな記事

### Selenium IDEの使い方について

 [SeleniumIDEのコマンドについて](https://qiita.com/oh_rusty_nail/items/77782973b4152992017b)

[Selenium IDEの基本的な使い方](https://yoshikiito.net/blog/archives/2362/)

#### JUnitで出力した場合に読む

[Seleniumのドキュメント](https://www.selenium.dev/ja/documentation/overview/)(日本語だったりそうじゃなかったりする。WebDriver＞待機は読んでおいたほうがいいと思う)

#### Selenideで出力した場合に読む

[Selenideの使い方](https://qiita.com/tatesuke/items/589e30ab9b3dc7037e26)



## その他雑感

### Targetに何書くん？？

- 操作、あるいはチェックの対象

- Chromeでの開発者ツールで取得できるセレクターでOKだと思う

- というかTarget横の□←マークを押して対象要素を押せば選択できる

## SearchTest_hogeについて

Selenium IDE上で以下のようなテストを作成、各様式でExportしたものをEclipse上のデバッグ実行でテスト成功になるようにちょいちょい書き換えたもの。ブラウザのクローズとかについてはあんまりよく考えていない。

**注意**このテストを実行するときは地震や台風等の災害が発生していないときに行うこと。テストの再実行は最低でも１分は開けて行うこと。（基本的に結構迷惑な行為なので）

### テスト内容

1. とあるトップページから防災情報のアイコンをクリック
2. キーワード検索をクリック
3. 東京と入力
4. 東京都のリンクをクリック
5. パンくず図に東京都の防災情報と表示されていることを確認





