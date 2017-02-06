package serviceImpl;

import java.util.*;
import domain.ArticleBean;
import service.BoardService;

public class BoardServiceImpl implements BoardService{
	private ArrayList<ArticleBean> list;
	@Override
	public void addArticle(ArticleBean param) {
		list=new ArrayList <ArticleBean>();
	}

	@Override
	public ArticleBean findOne(ArticleBean param) {
		ArticleBean article = new ArticleBean();
		
		return article;
	}

	@Override
	public List <ArticleBean> findSome(ArticleBean param) {
		ArrayList<ArticleBean> list = new ArrayList <ArticleBean>();
		for(int i=0;i<list.size();i++){
			if(param.getUid().equals(list.get(i).getUid())){
			}
		}
		return list;
	}

	@Override
	public List <ArticleBean> list() {
		return list;
	}

	@Override
	public void update(ArticleBean param) {
		for(ArticleBean art:list){
			/*String a=*/
			if(param.getSeq().equals(art.getSeq())){
				if(art.getTitle().equals("")){
					art.setTitle(art.getTitle());
				}else{
					art.setTitle(param.getTitle());
				}
				/*()?:;*/
				if(art.getContent().equals("")){
					art.setContent(art.getContent());
				}else{
					art.setContent(param.getContent());
				}
				break;
			}
		}
	}

	@Override
	public void delete(ArticleBean param) {
		Iterator<ArticleBean> it =list.iterator();
		while(it.hasNext()){
			if(it.next().getSeq().equals(param.getSeq())){
				it.remove();
			}
		}
		
	}

}
