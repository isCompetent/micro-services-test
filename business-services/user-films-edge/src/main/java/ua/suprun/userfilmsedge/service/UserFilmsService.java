package ua.suprun.userfilmsedge.service;

import ua.suprun.dto.userfilmsedge.UserFilmsDto;
import ua.suprun.dto.userfilmsedge.UsersLikedFilmDto;

/**
 * Class UserFilmsService implementation.
 *
 * @author Bohdan_Suprun
 */
public interface UserFilmsService
{
    UserFilmsDto getUserFilms(Long userId) throws Exception;

    UsersLikedFilmDto getUsersLikedFilm(Long filmId) throws Exception;
}
