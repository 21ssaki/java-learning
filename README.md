# java-learning
Java学習記録とコード練習

# Java 学習記録（Eclipse + Git）

## やったこと
- EclipseでJavaのプロジェクト作成
- GitHubに初めて**ターミナル経由で**Javaのコードをアップロード
- `.classpath`や`.project`ファイルが入ってしまったので削除して整理

## つまずいたところ
- ターミナルでGitを使うのに苦戦
- `git push`ができなかった（remoteとの整合性が取れていなかった）
- `.gitignore`の書き方を間違えてエラーに

## 🛠 解決法
- `git remote set-url`で正しいリモートURLに変更
- `git pull origin main --allow-unrelated-histories` で履歴統合
- `.gitignore`ファイルにEclipse関連の設定を追加して、再コミット

## 今後の方針
- 最初は難しかったが、エラーを調べて解決できた。
- 引き続きeclipseからのターミナル経由を続ける
